package clase23;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> ofertas = new ArrayList<>();

    public void agregar(OfertaAcademica oa){
        ofertas.add(oa);
    }

    public void generarInforme(){
        for (OfertaAcademica ofer:ofertas) {
            System.out.println(ofer.getNombre()+" -- Precio: "+ofer.calcularPrecio());
        }
    }

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.ofertas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<OfertaAcademica> getOfertas() {
        return ofertas;
    }

    public void setOferta(ArrayList<OfertaAcademica> ofertas) {
        this.ofertas = ofertas;
    }
}
