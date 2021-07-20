package clase20;

public class Hambriento implements Estado{
    private Tamagochi t;

    public Hambriento(Tamagochi t) {
        this.t = t;
        System.out.println("Hambriento");
    }

    @Override
    public void come() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void toma() {

    }

    @Override
    public void mimos() {

    }
}
