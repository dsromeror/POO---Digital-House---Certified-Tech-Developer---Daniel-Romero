package clase23;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentajeBonificacion;
    private ArrayList<OfertaAcademica> ofertaAcademicas;

    public ProgramaIntensivo() {
        this.ofertaAcademicas = new ArrayList<>();
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public ArrayList<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public void setOfertaAcademicas(ArrayList<OfertaAcademica> ofertaAcademicas) {
        this.ofertaAcademicas = ofertaAcademicas;
    }

    public void agregar(OfertaAcademica oferta){
        ofertaAcademicas.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (OfertaAcademica o:ofertaAcademicas) {
            total+=o.calcularPrecio();
        }
        return total*(1-porcentajeBonificacion);
    }
}
