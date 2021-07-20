package Examen;

public class Licenciatura extends Titulo implements Comparable {
    private String temaTesis;
    private String fechaEntrega;
    private int trabajoInvestigacion;

    public String getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getTrabajoInvestigacion() {
        return trabajoInvestigacion;
    }

    public void setTrabajoInvestigacion(int trabajoInvestigacion) {
        this.trabajoInvestigacion = trabajoInvestigacion;
    }

    public Licenciatura(int cantidadMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String temaTesis, String fechaEntrega, int trabajoInvestigacion) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto, persona);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.trabajoInvestigacion = trabajoInvestigacion;
    }

    @Override
    public int compareTo(Object o){
        Licenciatura comparando = (Licenciatura) o;
        int resultado = 0;
        if (trabajoInvestigacion > comparando.trabajoInvestigacion)
            resultado = 1;
        else if (trabajoInvestigacion < comparando.trabajoInvestigacion)
            resultado = -1;
        return resultado;
    }
}
