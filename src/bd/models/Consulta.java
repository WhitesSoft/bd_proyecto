package bd.models;

/**
 *
 * @author juandaniel
 */
public class Consulta {
    
    private int id;
    private String descripcion;
    private String fecha;
    private int idMascota;
    private Mascota mascota;

    public Consulta() {
    }

    public Consulta(int id, String descripcion, String fecha, int idMascota) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.idMascota = idMascota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", idMascota=" + idMascota + '}';
    }

 
}
