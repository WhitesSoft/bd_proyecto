package bd.models;

/**
 *
 * @author juandaniel
 */
public class Factura {
    
    private int id;
    private String razonSocial;
    private int nit;
    private float monto;

    public Factura() {
    }

    public Factura(int id, String razonSocial, int nit, float monto) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
    
}
