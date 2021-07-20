package clase20A;

public class Rojo implements  StateSemaforo{
    private Semaforo s;

    public Rojo(Semaforo s){
        this.s =s;
    }

    @Override
    public void mostrarAviso(){
        System.out.println("El semaforo está en "+s.getEstado());
    }

    @Override
    public void cambiarEstado(){
        s.setEstado(new Verde(s));
        System.out.println("El semáforo ahora pasa a Verde");
    }
}
