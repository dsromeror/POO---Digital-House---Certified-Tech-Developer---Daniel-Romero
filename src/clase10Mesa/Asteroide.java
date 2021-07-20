package clase10Mesa;

public class Asteroide extends Objeto{
    private Integer lesion;

    public Asteroide(int x, int y, char direccion, int lesion) {
        super(x, y, direccion);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion){
        super.setPosx(x);
        super.setPosy(y);
        super.setDireccion(direccion);
    }

    @Override
    public int hashCode(){
        return 83 * this.lesion.hashCode();
    }

    @Override
    public boolean equals (Object o){
        return !(o == null || o instanceof Asteroide) && this.hashCode() == o.hashCode();
    }
}
