/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ui.Consultas;

import bd.models.Cliente;
import bd.models.Consulta;
import bd.models.Factura;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandaniel
 */
public class Consultas extends javax.swing.JPanel {

    public DefaultTableModel modelo;

    public Consultas() {
        initComponents();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHistorial = new javax.swing.JTable();

        setBackground(new java.awt.Color(22, 29, 42));

        jPanel3.setBackground(new java.awt.Color(33, 45, 62));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBackground(new java.awt.Color(33, 45, 62));

        TableHistorial.setBackground(new java.awt.Color(33, 45, 62));
        TableHistorial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TableHistorial.setForeground(new java.awt.Color(255, 255, 255));
        TableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Apellido Paterno", "Apellido Materno", "Carnet de Identidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableHistorial.setGridColor(new java.awt.Color(204, 204, 204));
        TableHistorial.setSelectionForeground(new java.awt.Color(255, 255, 255));
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        TableHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableHistorial);
        jScrollPane1.setOpaque (false);
        TableHistorial.setOpaque (false);
        ((DefaultTableCellRenderer) TableHistorial.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHistorialMouseClicked

        if (evt.getClickCount() == 2) {

            //codigo para sacar el id de la mascota de la tabla
            int idConsulta = 0;
            for (int i = 0; i <= TableHistorial.getSelectedRow(); i++) {
                idConsulta = Integer.parseInt(TableHistorial.getValueAt(i, 1).toString());
            }

            String[] botones = {"Ver Factura"};
            int ventana = JOptionPane.showOptionDialog(null, "Selecciona una opcion:", "Seleccione", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

            if (ventana == 0) { //Ver
                cargarFactura(idConsulta);
            }

        }
    }//GEN-LAST:event_TableHistorialMouseClicked

    private void cargarDatos() {

        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "VETERINARIA");
        try {

            ObjectSet result = db.queryByExample(Consulta.class);

            ArrayList<Consulta> listaConsultas = new ArrayList<>();
            while (result.hasNext()) {
                listaConsultas.add((Consulta) result.next());
            }

            DefaultTableModel model = mostrarConsultas(listaConsultas);
            TableHistorial.setModel(model);

            //Ocultar numeracion de la tabla
            TableHistorial.getColumnModel().getColumn(0).setMaxWidth(0);
            TableHistorial.getColumnModel().getColumn(0).setMinWidth(0);
            TableHistorial.getColumnModel().getColumn(0).setPreferredWidth(0);

            //Ocultar id de la mascota
            TableHistorial.getColumnModel().getColumn(1).setMaxWidth(0);
            TableHistorial.getColumnModel().getColumn(1).setMinWidth(0);
            TableHistorial.getColumnModel().getColumn(1).setPreferredWidth(0);

        } finally {
            db.close();
        }

    }

    public DefaultTableModel mostrarConsultas(List<Consulta> consultas) {

        int contador = 1; // Dedicado para acomular en número de registros que hay en la tabla

        String[] nombresColumnas = {"  #  ", "id", "Id Mascota", "Consulta", "Fecha"};//Indica el nombre de las columnas en la tabla
        String[] registros = new String[5];

        DefaultTableModel model;
        //bloquear celdas editables
        model = new DefaultTableModel(null, nombresColumnas) {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };

        for (int i = 0; i < consultas.size(); i++) {
            registros[0] = Integer.toString(contador);
            registros[1] = String.valueOf(consultas.get(i).getId());
            registros[2] = String.valueOf(consultas.get(i).getIdMascota());
            registros[3] = String.valueOf(consultas.get(i).getDescripcion());
            registros[4] = String.valueOf(consultas.get(i).getFecha());

            model.addRow(registros);
            contador++;
        }

        return model;
    }

    private void cargarFactura(int idConsulta) {
        System.out.println(idConsulta);
        
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "VETERINARIA");
        try {
            ObjectSet result = db.queryByExample(new Factura(0, null, 0, 0, idConsulta));
            Factura factura = (Factura) result.get(0);

            String info = "Razon Social: " + factura.getRazonSocial() + "\n"
                    + "NIT: " + factura.getNit() + "\n"
                    + "Total: " + factura.getMonto() + " Bs.\n";

            JOptionPane.showMessageDialog(null, info);

        } finally {
            db.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableHistorial;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
