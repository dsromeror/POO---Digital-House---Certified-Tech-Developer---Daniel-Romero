package clase22;

public class Comida extends Item{
    public double precio;

    public Comida(String nombre, double precio) {
        setNombre(nombre);
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrar() {
        return getNombre()+"--> Precio "+calcularPrecio();
    }

    @Override
    public String obtenerNombre() {
        return getNombre();
    }
}
