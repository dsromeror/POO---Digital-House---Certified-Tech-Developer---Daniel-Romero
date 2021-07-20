package clase20;

public class Sediento implements Estado{
    private Tamagochi t;

    public Sediento(Tamagochi t) {
        this.t = t;
        System.out.println("Sediento");
    }

    @Override
    public void come() {

    }

    @Override
    public void toma() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void mimos() {

    }
}
