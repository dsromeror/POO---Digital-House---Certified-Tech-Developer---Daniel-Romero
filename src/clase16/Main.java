package clase16;

public class Main {
    public static void main(String[] args) {
        Equipo e = new Equipo("Champions");
        Jugador jugador = new Jugador(5,"Daniel",false,true);
        Jugador jugador2 = new Jugador(6,"Steven",false,true);
        Jugador jugador3 = new Jugador(2,"Carlos",true,true);

        e.addJugador(jugador);
        e.addJugador(jugador2);
        e.addJugador(jugador3);
        e.mostrarJugadoresTitulares();
        System.out.println("Lesionados: "+e.getCantidadJugadoresLesionados());
    }

}
