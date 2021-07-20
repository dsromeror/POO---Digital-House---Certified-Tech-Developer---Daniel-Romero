package Examen;

public abstract class Titulo {
    private int cantidadMaterias;
    private String fechaInicio;
    private String fechaFinalizacion;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }

    public boolean puedeEjercer(){
        return selladoMinisterio && selladoInstituto;
    }

    public Titulo(int cantidadMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona) {
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
        this.persona = persona;
    }
}
