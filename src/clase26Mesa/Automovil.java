package clase26Mesa;

public class Automovil implements StrategyRecorrido {

    @Override
    public double calcularTiempo(double distancia) {
        //Automóvil: distancia / 0.40366 * 4
        double tiempo=0;
        tiempo= distancia / 0.40366 * 4;

        return tiempo;
    }
}
