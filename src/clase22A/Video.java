package clase22A;

public class Video implements Archivo{
    private String nombre;

    public Video(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarNombre() {
        getNombre();
    }
}
