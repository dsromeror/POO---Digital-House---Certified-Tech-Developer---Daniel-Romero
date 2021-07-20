package clase20Mesa;

public class Cargando implements Estado{
    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Cargando");
    }

    @Override
    public void agregar(Producto producto) {
        carrito.getProductos().add(producto);
    }

    @Override
    public void volverAtras() {
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(this.carrito));
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Pagando(carrito));
    }

    @Override
    public void cancelar() {
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }
}
