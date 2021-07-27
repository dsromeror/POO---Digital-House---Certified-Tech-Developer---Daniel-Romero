package clase26Mesa;

public class Main {

    public static void main(String[]args){
        Punto p1 = new Punto(-32.8466638926027, -68.8630909255083);
        Punto p2 = new Punto(-36.57707226917161, -56.68771310349415);

        Recorrido rec1 = new Recorrido(new Caminata());
        System.out.println("El tiempo del recorrido caminando es: " + rec1.calcularTiempo(p2.calcularDistancia(p1)));

        Recorrido rec2 = new Recorrido(new Automovil());
        System.out.println("El tiempo del recorrido en automovil es: " + rec2.calcularTiempo(p2.calcularDistancia(p1)));

        Recorrido rec3 = new Recorrido(new Bicicleta());
        System.out.println("El tiempo del recorrido en bicicleta es: " + rec3.calcularTiempo(p2.calcularDistancia(p1)));

    }
}
