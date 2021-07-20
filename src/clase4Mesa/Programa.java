package clase4Mesa;

public class Programa {
    public static void main(String[] args){
        UsuarioJuego usuario = new UsuarioJuego("Daniel", "Colombia");
        System.out.println("Hola: " + usuario.getNombre());
        System.out.println(usuario.getNombre() + " tu puntaje es: " + usuario.getPuntaje());
        System.out.println(usuario.getNombre() + " tu nivel es: " + usuario.getNivel());
        usuario.aumentar();
        usuario.subirNivel();
        System.out.println(usuario.getNombre() + " tu puntaje es: " + usuario.getPuntaje());
        System.out.println(usuario.getNombre() + " tu nivel es: " + usuario.getNivel());
        usuario.bonus(20);
        System.out.println("Con el bonus tienes ahora: " + usuario.getPuntaje() + " en puntaje");
        usuario.aumentar();
        usuario.aumentar();
        usuario.subirNivel();
        usuario.subirNivel();
        System.out.println(usuario.getNombre() + " tu puntaje es: " + usuario.getPuntaje());
        System.out.println(usuario.getNombre() + " tu nivel es: " + usuario.getNivel());
    }
}
