package clase17;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel", "Romero", "123",2500,500);
        try {
            cliente.comprar(1000);
        }catch (ClienteExcepcion e){
            System.out.println(e.toString());
        }
        try {
            cliente.saldarDeuda(1000);
        }catch (ClienteExcepcion e){
            System.out.println(e.toString());
        }
    }
}
