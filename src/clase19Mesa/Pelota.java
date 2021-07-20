package clase19Mesa;

public class Pelota extends Producto{
    private double radio = 11;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

     @Override
    public double calcularEspacio(){
        return (4 / 3) * Math.PI*Math.pow(radio,3);
     }
}
