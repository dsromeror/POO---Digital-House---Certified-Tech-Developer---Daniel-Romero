package clase19Mesa;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen("Almacen POO");

        Caja c1 = (Caja) ProductoFactory.getInstance().crearProducto("CAJA10X10");

        Pelota p1 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTAFUTBOL");
        Pelota p2 = (Pelota) ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        p2.setRadio(0.32);

        almacen.getProductos().add(c1);
        almacen.getProductos().add(p1);
        almacen.getProductos().add(p2);

        double total = almacen.calcularEspacioNecesario();
        System.out.println(total);

    }
}
