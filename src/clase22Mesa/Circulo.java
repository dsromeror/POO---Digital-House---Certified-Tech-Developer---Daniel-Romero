package clase22Mesa;

public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String mostrarFigura() {
        return "Soy un circulo";
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio, 2)*Math.PI;
    }
}
