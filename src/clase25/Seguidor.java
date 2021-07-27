package clase25;

public class Seguidor implements Observador{
    private String nombre;
    private String apellido;
    private int cantidadNotificaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantidadNotificaciones() {
        return cantidadNotificaciones;
    }

    public void setCantidadNotificaciones(int cantidadNotificaciones) {
        this.cantidadNotificaciones = cantidadNotificaciones;
    }

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cantidadNotificaciones=0;
    }

    @Override
    public void actualizar(String nombre) {
        System.out.println(getNombre()+" fue notificado de la foto subida de "+nombre);
        cantidadNotificaciones++;
    }

    public void mostrarCantidadNotificaciones(){
        System.out.println("Cantidad de notificaciones recibidas: "+getCantidadNotificaciones());
    }
}

