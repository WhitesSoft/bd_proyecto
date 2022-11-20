package bd.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juandaniel
 */
public class Cliente {
    
    private int ci;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNac;
    private int celular;
    private String fechaReg;
    private List mascotas;

    public Cliente() {
    }

    public Cliente(int ci, String nombres, String apellidoPaterno, String apellidoMaterno, String fechaNac, int celular, String fechaReg) {
        this.ci = ci;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.fechaReg = fechaReg;
        this.mascotas = new ArrayList();   
    }

    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(String fechaReg) {
        this.fechaReg = fechaReg;
    }

    public List getMascotas() {
        return mascotas;
    }

    public void setMascotas(List mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ci=" + ci + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", fechaNac=" + fechaNac + ", celular=" + celular + ", fechaReg=" + fechaReg + ", mascotas=" + mascotas + '}';
    }
   
}
