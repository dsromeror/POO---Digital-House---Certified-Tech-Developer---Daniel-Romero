package clase22Mesa;

public class Rectangulo implements Figura{
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String mostrarFigura() {
        return "Soy un rectángulo";
    }

    @Override
    public double calcularArea() {
        return alto*largo;
    }
}
