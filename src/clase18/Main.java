package clase18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion("ARGENTINA");
        seleccion.agregarJugador(new Jugador("Pumpido",1, "ARQUERO"));
        seleccion.agregarJugador(new Jugador("Batista",2, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Balbo",3, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Basualdo",4, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Bauza",5, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Calderon",6, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Burruchaga",7, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Caniggia",8, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Dezotti",9, "DELANTERO"));
        seleccion.agregarJugador(new Jugador("Maradona",10, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Fabri",11, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Goycochea",12, "ARQUERO"));
        seleccion.agregarJugador(new Jugador("Lorenzo",13, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Giusti",14, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Monzon",15, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Olarticoechea",16, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Sensini",17, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Serrizuela",18, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Ruggeri",19, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Simon",20, "DEFENSOR"));
        seleccion.agregarJugador(new Jugador("Troglio",21, "MEDIOCAMPISTA"));
        seleccion.agregarJugador(new Jugador("Cancelarich",22, "ARQUERO"));
        seleccion.agregarJugador(new Jugador("Comizzo",23, "ARQUERO"));

        ArrayList<Jugador> jugadoresReservas = seleccion.obtenerReservas();
        System.out.println("Jugadores en reserva");
        for (Jugador jugador: jugadoresReservas) {
            System.out.println(jugador.getApellido());
        }
        try{
            System.out.println("Cantidad de defensores " + seleccion.cantJugadores("DEFENSOR"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
