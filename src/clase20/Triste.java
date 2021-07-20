package clase20;

public class Triste implements Estado{
    private Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
        System.out.println("Triste");
    }

    @Override
    public void come() {
        System.out.println("Beep.Beep.Vomitando");
    }

    @Override
    public void toma() {
        System.out.println("Beep.Beep. Titilando");
    }

    @Override
    public void mimos() {
        t.setEstado(new Feliz(t));
    }
}
