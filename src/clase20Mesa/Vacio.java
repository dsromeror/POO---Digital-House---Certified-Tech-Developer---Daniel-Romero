package clase20Mesa;

public class Vacio implements Estado{
    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("El carrito está vacío");
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
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void cancelar() {
        System.out.println("No disponible");
    }
}
