package clase19Mesa;

import java.util.ArrayList;

public class Almacen {
    private String nombre;
    private ArrayList<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double calcularEspacioNecesario(){
        double espacio = 0;
        for (Producto p: productos) {
            espacio += p.calcularEspacio();
        }
        return espacio;
    }
}
