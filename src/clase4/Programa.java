package clase4;

public class Programa {
    public static void main(String[] args){
        Cliente c = new Cliente("310789103", "Daniel");
        System.out.println("Deuda de: " + c.getNombre());
        System.out.println("Total: " + c.getDeuda());
        c.incrementarDeuda(130.5);
        System.out.println("Deuda de: " + c.getNombre());
        System.out.println("Total: " + c.getDeuda());
        c.pagarDeuda();
        System.out.println("Deuda de: " + c.getNombre());
        System.out.println("Total: " + c.getDeuda());
        c.setNombre("Steven");
        System.out.println("Deuda de: " + c.getNombre());
        System.out.println("Total: " + c.getDeuda());
    }
}
