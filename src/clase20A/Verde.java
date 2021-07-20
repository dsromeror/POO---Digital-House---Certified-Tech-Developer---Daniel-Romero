package clase20A;

public class Verde implements StateSemaforo{
    private Semaforo s;

    public Verde( Semaforo s){
        this.s = s;
    }

    @Override
    public void mostrarAviso(){
        System.out.println("El semáforo está en: "+s.getEstado());
    }

    @Override
    public void cambiarEstado(){
        s.setEstado(new Amarillo(s));
        System.out.println("El semáforo ahora pasa a Amarillo");
    }
}
