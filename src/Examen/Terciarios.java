package Examen;

public class Terciarios extends Titulo{
    private String validacion;

    public String getValidacion() {
        return validacion;
    }

    public void setValidacion(String validacion) {
        this.validacion = validacion;
    }

    public Terciarios(int cantidadMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Persona persona, String validacion) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto, persona);
        this.validacion = validacion;
    }

    public boolean validoNacional(){
        return (validacion=="NACIONAL");
    }
}
