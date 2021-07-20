package clase20;

public class Main {
    public static void main(String[] args) {
        //Tamagochi hambriento

        Tamagochi tomi = new Tamagochi();
        tomi.come();
        tomi.come();
        tomi.setEstado(new Triste(tomi));
        tomi.come();
    }
}