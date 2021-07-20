package clase20Mesa;

import java.util.ArrayList;

public class Carrito {
    private Estado estado;
    private ArrayList<Producto> productos;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Carrito() {
        this.estado = new Vacio(this);
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos){
        this.productos = productos;
    }

    public void agregar(Producto producto){
        getEstado().agregar(producto);
    }

    public void volverAtras(){
        getEstado().volverAtras();
    }

    public void siguienteEstado(){
        getEstado().siguienteEstado();
    }

    public void cancelar(){
        getEstado().cancelar();
    }

    public void mostrarProductos(){
        for (Producto p: productos) {
            System.out.println(p.getDescripcion() + ": $"+p.getPrecio());
        }
    }
}
