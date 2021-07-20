package clase16Mesa;

public class Contenedor implements Comparable<Contenedor>{
    private int nroIdentificador;
    private String pais;
    private boolean peligroso;

    public int getNroIdentificador() {
        return nroIdentificador;
    }

    public void setNroIdentificador(int nroIdentificador) {
        this.nroIdentificador = nroIdentificador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }

    public Contenedor(int nroIdentificador, String pais, boolean peligroso) {
        this.nroIdentificador = nroIdentificador;
        this.pais = pais;
        this.peligroso = peligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        int resp =0;
        if (nroIdentificador>o.getNroIdentificador())
            resp = 1;
        if (nroIdentificador<o.getNroIdentificador())
            resp = -1;
        return 0;
    }

    @Override
    public String toString(){
        return "El contenedor con N° "+nroIdentificador+" tiene procedencia de "+pais;
    }
}