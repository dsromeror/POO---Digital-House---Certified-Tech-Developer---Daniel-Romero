package clase25;
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jorge", "Jorge");
        Seguidor seguidor = new Seguidor("Juan", "Juan");
        Seguidor seguidor2 = new Seguidor("Pedro", "Pedro");

        usuario.agregar(seguidor);
        usuario.agregar(seguidor2);
        usuario.setFotoSubida(true);
        usuario.notificar();
        seguidor.mostrarCantidadNotificaciones();
        seguidor2.mostrarCantidadNotificaciones();
    }
}