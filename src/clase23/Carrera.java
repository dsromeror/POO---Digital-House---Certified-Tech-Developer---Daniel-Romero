package clase23;

import java.util.ArrayList;

public class Carrera extends OfertaAcademica{
    private double valorBasico;
    private ArrayList<OfertaAcademica> ofertaAcademicas;

    public Carrera() {
       ofertaAcademicas = new ArrayList<>();
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public ArrayList<OfertaAcademica> getOfertaAcademicas() {
        return ofertaAcademicas;
    }

    public void setOfertaAcademicas(ArrayList<OfertaAcademica> ofertaAcademicas) {
        this.ofertaAcademicas = ofertaAcademicas;
    }

    public void agregar(OfertaAcademica oferta) throws Exception{
        if (oferta instanceof Curso){
            Curso c= (Curso)oferta;
            if(c.getCargaHorariaMensual()<10){
                throw new Exception("No se permite cursos de menos de 10 horas en Carrera");
            }
        }
    }

    @Override
    public double calcularPrecio() {
        double total = valorBasico;
        for (OfertaAcademica ofer:ofertaAcademicas) {
            total+=ofer.calcularPrecio();
        }
        return total;
    }
}
