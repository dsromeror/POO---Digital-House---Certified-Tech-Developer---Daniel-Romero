package ExamenFinal;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Servicio> servicios = new ArrayList<>();

    public Empresa(){
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    public void agregar(Servicio s){
        servicios.add(s);
    }

    public void mostrarServicios(){
        for (Servicio ser:servicios) {
            System.out.println(ser.getNombre()+" --> Precio: "+ser.calcularPrecio());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
