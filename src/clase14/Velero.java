package clase14;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean evaluar(){
        return cantidadMastiles>4;
    }
}
