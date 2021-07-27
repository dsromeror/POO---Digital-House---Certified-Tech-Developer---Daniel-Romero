package clase26Mesa;

public class Punto {
    private double latitud;
    private double longitud;

    public Punto(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double calcularDistancia(Punto p){
        // distancia = abs(latitud1 - latitud2) + abs(longitud1 - longitud2)
        //el valor absoluto se calcula haciendo uso del método abs de la clase Math:
        //java.lang.Math.abs
        double distancia=0;
        distancia= Math.abs(p.getLatitud()-latitud) + Math.abs(p.getLongitud()-longitud);

        return distancia;
    }
}
