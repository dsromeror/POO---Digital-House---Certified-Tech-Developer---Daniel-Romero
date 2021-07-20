package clase6;

public class Programa {
    public static void main(String[] args){
        impresora impresora = new impresora("ImpreMax","USB", 500);
        System.out.println("Impresora "+impresora.getModelo());
        impresora.encender();
        System.out.println("Papel restante: "+impresora.getHojasDisponibles());
        impresora.imprimir("Texto de prueba");
        System.out.println("Papel restante: "+impresora.getHojasDisponibles());
        impresora.apagar();
    }
}
