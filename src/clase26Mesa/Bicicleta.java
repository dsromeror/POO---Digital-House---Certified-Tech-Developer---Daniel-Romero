package clase26Mesa;

public class Bicicleta implements StrategyRecorrido{
    @Override
    public double calcularTiempo(double distancia) {
        //Bicicleta: distancia / 0.050366 * 1.5
        double tiempo=0;
        tiempo= distancia / 0.050366 * 1.5;

        return tiempo;
    }
}
