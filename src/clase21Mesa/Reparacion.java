package clase21Mesa;


public class Reparacion {
    private String articulo;
    private double presupuesto;
    private String direccion;

    private ReparacionState estado;

    public Reparacion(String articulo, double presupuesto, String direccion, ReparacionState reparacionState) {
        this.articulo = articulo;
        this.presupuesto = presupuesto;
        this.direccion = direccion;
        estado = new EnPresupuesto(this);
    }

    public ReparacionState getReparacionState() {
        return estado;
    }

    public void setReparacionState(ReparacionState estado) {
        this.estado = estado;
    }
}
