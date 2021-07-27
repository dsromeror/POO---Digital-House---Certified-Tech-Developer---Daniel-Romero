package clase26;
public class Persona {
    private String nombre;
    private int cantidadDosis;

    public Persona(String nombre) {
        this.nombre = nombre;
        cantidadDosis=0;
    }

    public void incrementarDosis(){
        cantidadDosis++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }
}