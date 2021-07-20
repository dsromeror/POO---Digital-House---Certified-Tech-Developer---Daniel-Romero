package clase22;

public abstract class Item {
    private String nombre;

    public abstract  double calcularPrecio();
    public abstract  String mostrar();
    public abstract String obtenerNombre();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
