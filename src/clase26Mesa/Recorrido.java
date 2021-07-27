package clase26Mesa;

public class Recorrido {

    private StrategyRecorrido recorrido;

    public Recorrido(StrategyRecorrido recorrido) {
        this.recorrido = recorrido;
    }

    public StrategyRecorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(StrategyRecorrido recorrido) {
        this.recorrido = recorrido;
    }

    public double calcularTiempo(double distancia){
        return recorrido.calcularTiempo(distancia);
    }
}
