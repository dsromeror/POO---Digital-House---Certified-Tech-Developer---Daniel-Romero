package clase20Mesa;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Productos POO1",100);
        Producto producto2 = new Producto("Productos POO2",1000);
        Carrito carrito = new Carrito();

        carrito.mostrarProductos();
        carrito.siguienteEstado();
        carrito.agregar(producto1);
        carrito.agregar(producto2);
        carrito.mostrarProductos();
        carrito.cancelar();
        carrito.siguienteEstado();
        carrito.mostrarProductos();
        carrito.mostrarProductos();
        carrito.siguienteEstado();


/*
        carrito.siguienteEstado();
        carrito.agregar(producto1);
        carrito.agregar(producto2);
        carrito.mostrarProductos();*/
    }
}
