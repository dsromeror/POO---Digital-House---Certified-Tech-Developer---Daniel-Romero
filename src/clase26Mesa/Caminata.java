package clase26Mesa;

public class Caminata implements StrategyRecorrido {
    @Override
    public double calcularTiempo(double distancia) {
        //Caminando: distancia / 0.20366 * 13
        double tiempo=0;
        tiempo= distancia / 0.20366 * 13;

        return tiempo;
    }
}
