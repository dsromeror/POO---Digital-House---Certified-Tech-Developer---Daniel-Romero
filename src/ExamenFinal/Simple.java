package ExamenFinal;

public class Simple extends Servicio{
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if (getNombre()=="Colocación"){
            return precio*1.1;
        }
        return precio;
    }
}
