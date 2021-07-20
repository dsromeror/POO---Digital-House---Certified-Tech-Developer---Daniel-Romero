package clase19A;

public abstract class Iphone {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void modelo(){
        System.out.println("El modelo del iphone es " + getNombre());
    }
}
