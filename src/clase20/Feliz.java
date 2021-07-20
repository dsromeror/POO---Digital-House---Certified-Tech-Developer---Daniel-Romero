package clase20;

public class Feliz implements Estado{
    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
        System.out.println("Feliz");
    }

    @Override
    public void come() {

    }

    @Override
    public void toma() {
        System.out.println("Beep.Beep.Beep.Beep.Beep");
    }

    @Override
    public void mimos() {

    }
}
