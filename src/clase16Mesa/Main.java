package clase16Mesa;

import clase16.Equipo;
import clase16.Jugador;

public class Main {
    public static void main(String[] args) {
        Puerto p = new Puerto("Buenos Aires");
        Contenedor c1 = new Contenedor(125,"Brasil", false);
        Contenedor c2 = new Contenedor(544,"DESCONOCIDO", true);
        Contenedor c3 = new Contenedor(445,"EEUU", false);

        p.addContenedor(c1);
        p.addContenedor(c2);
        p.addContenedor(c3);
        p.mostrarContenedoresOrdenados();
        System.out.println("Cantidad de contenedores desconocidos: "+p.getContenedoresPeligrososDesconocidos());
    }
}
