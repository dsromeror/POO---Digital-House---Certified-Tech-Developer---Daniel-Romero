package ExamenFinal;

import java.util.ArrayList;

public class Combo extends Servicio{
    private double descuento;
    private ArrayList<Servicio> servicio;

    public Combo(){
        this.servicio = new ArrayList<>();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public ArrayList<Servicio> getServicio() {
        return servicio;
    }

    public void setServicio(ArrayList<Servicio> servicio) {
        this.servicio = servicio;
    }

    public void agregar(Servicio s){
        servicio.add(s);
    }


    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Servicio s:servicio) {
            total+=s.calcularPrecio();
        }
        return total*(100-descuento)/100;
    }
}
