package clase18;

import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private ArrayList<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        plantel.add(j);
    }

    public ArrayList<Jugador> obtenerReservas() {
        ArrayList<Jugador> reservas = new ArrayList<>();
        for (int i = plantel.size() - 1; i >= plantel.size() - 5; i--) {
            reservas.add(plantel.get(i));
        }
        return reservas;
    }

    public int cantJugadores(String p) throws Exception {
        int resp = 0;
        if (p.equals("ARQUERO") || p.equals("MEDIOCAMPISTA") || p.equals("DELANTERO") || p.equals("DEFENSOR")) {
            for (Jugador jug : plantel) {
                if (jug.getPosicion().equals(p))
                    resp++;
            }
        } else {
            throw new Exception("La posición ingresada no es correcta. Error");
        }
        return resp;
    }
}
