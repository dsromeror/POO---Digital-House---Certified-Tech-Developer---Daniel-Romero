package clase20A;

public class Amarillo implements StateSemaforo{
    private Semaforo s;

    public Amarillo(Semaforo s){
        this.s =s;
    }
    @Override
    public void mostrarAviso(){
        System.out.println("El semaforo está en "+s.getEstado());
    }

    @Override
    public void cambiarEstado(){
        s.setEstado(new Rojo(s));
        System.out.println("El semáforo ahora pasa a Rojo");

    }
}
