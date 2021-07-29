package clase27;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Local local = new Local();
        Producto p1 = new Producto(1,"Leche",50);
        Producto p2 = new Producto(2,"Pan",80);
        Cliente cliente = new Cliente("Daniel", "Apellido", "dsromeror@unal.edu.co");
        //local.agregarCliente("Daniel", "Apellido", "dsromeror@unal.edu.co");
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        System.out.println(carrito.importeTotal());
    }
}
