package clase20Mesa;

public class Pagando implements Estado{
    private  Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Pagando");
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
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cerrado(carrito));
    }

    @Override
    public void cancelar() {
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }
}
