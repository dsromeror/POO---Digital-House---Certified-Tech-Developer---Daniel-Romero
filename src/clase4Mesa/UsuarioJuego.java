package clase4Mesa;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

    public void aumentar(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor){
        puntaje+=valor;
    }
}
