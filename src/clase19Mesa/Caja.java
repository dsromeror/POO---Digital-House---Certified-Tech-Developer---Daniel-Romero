package clase19Mesa;

public class Caja extends Producto{
    private double longitud = 10;
    private double ancho = 10;
    private double altura = 10;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularEspacio(){
        return longitud*altura*ancho;
    }
}
