package clase20;

public class Tamagochi {
    private Estado estado;

    public Tamagochi() {
        estado = new Hambriento(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //acciones
    public void come(){
        getEstado().come();
    }

    public void toma(){
        getEstado().toma();
    }

    public void mimos(){
        getEstado().mimos();
    }
}
