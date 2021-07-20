package clase14;

public class Yate extends Embarcacion implements Comparable{
    private int cantidadCamarotes;

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        int comp = 0;
        if (cantidadCamarotes>((Yate)o).cantidadCamarotes)
            comp = 1;
        if (cantidadCamarotes<((Yate)o).cantidadCamarotes)
            comp = -1;
        return comp;

    }

}
