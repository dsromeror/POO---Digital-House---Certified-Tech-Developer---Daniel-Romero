package clase20Mesa;

public class Cerrado implements Estado{
    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Cerrado");
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregar(Producto producto) {
        System.out.println("No disponible");
    }

    @Override
    public void volverAtras() {
        System.out.println("No disponible");
    }

    @Override
    public void siguienteEstado() {
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void cancelar() {
        System.out.println("No disponible");
    }
}
