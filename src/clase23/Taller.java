package clase23;

public class Taller extends OfertaAcademica{
    private int cantidadTrabajos;
    private double precioCadaTrabajo;

    public int getCantidadTrabajos() {
        return cantidadTrabajos;
    }

    public void setCantidadTrabajos(int cantidadTrabajos) {
        this.cantidadTrabajos = cantidadTrabajos;
    }

    public double getPrecioCadaTrabajo() {
        return precioCadaTrabajo;
    }

    public void setPrecioCadaTrabajo(double precioCadaTrabajo) {
        this.precioCadaTrabajo = precioCadaTrabajo;
    }

    @Override
    public double calcularPrecio() {
        return cantidadTrabajos*precioCadaTrabajo;
    }
}
