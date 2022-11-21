package bd.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juandaniel
 */
public class Mascota {

    private int id;
    private String nombre;
    private String fechaNac;
    private String raza;
    private String color;
    private double peso;
    private Cliente cliente;
    private List consultas;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String fechaNac, String raza, String color, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.consultas = new ArrayList();
    }

    public void addConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List getConsultas() {
        return consultas;
    }

    public void setConsultas(List consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", raza=" + raza + ", color=" + color + ", peso=" + peso + ", consultas=" + consultas + '}';
    }

}
