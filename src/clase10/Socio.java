package clase10;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private double cuotaMensual;
    private String actividad;

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Socio(String numero, String nombre, String actividad, double cuota){
        numeroSocio = numero;
        this.nombre = nombre;
        cuotaMensual = cuota;
        this.actividad = actividad;
    }

    public double cuotaMensual(){
        //return cuotaMensual;
        return getCuotaMensual();
    }

    @Override
    public String toString(){
        return "Número de socio: " + numeroSocio + " Nombre: " + nombre;
    }

    @Override
    public int hashCode(){
        int hash=37;
        hash=hash*nombre.hashCode();
        hash=hash*numeroSocio.hashCode();
        return hash;
    }

    @Override
    public boolean equals (Object o){
        if (o==null){
            return false;
        }
        if (!(o instanceof  Socio)){
            return false;
        }else{
            if (numeroSocio.equals(((Socio) o).getNumeroSocio())){
                return true;
            }
        }
        return false;
    }
}

