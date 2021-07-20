package clase6MesaTrabajo;

import java.time.Year;

public class InstitucionAdopcion {
    private boolean yaFueAdoptado;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String nombrePerro;
    private int year = Year.now().getValue();

    public boolean isAdopcion() {
        return yaFueAdoptado;
    }

    public void setAdopcion(boolean adopcion) {
        this.yaFueAdoptado = adopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int edadPerro(){
        return year - anioNacimiento;
    }
    public boolean puedePerderse(){
        return !chip;
    }
    public boolean pesoMayorA5(){
        return peso>5.0;
    }
    public boolean sePuedeAdoptar(){
        return pesoMayorA5() && !lastimado && !yaFueAdoptado;
    }

    public InstitucionAdopcion(boolean yaFueAdoptado, String raza, int anioNacimiento, double peso, boolean chip, boolean lastimado, String nombrePerro) {
        this.yaFueAdoptado = yaFueAdoptado;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombrePerro = nombrePerro;
    }

    public InstitucionAdopcion(boolean yaFueAdoptado, int anioNacimiento, double peso, boolean chip, boolean lastimado, String nombrePerro) {
        this.yaFueAdoptado = yaFueAdoptado;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombrePerro = nombrePerro;
    }
}