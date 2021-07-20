package clase16;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> plantel;

    public Equipo(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    public void addJugador (Jugador j){
        plantel.add(j);
    }

    public void mostrarJugadoresTitulares(){
        plantel.sort(null);
        for (Jugador jug: plantel) {
            if (jug.isTitular())
                System.out.println(jug.toString());
        }
    }

    public int getCantidadJugadoresLesionados(){
        int cant = 0;
        for (Jugador jug:plantel) {
            if (jug.isTitular() && jug.isLesionado())
                cant++;
        }
        return cant;
    }

}
