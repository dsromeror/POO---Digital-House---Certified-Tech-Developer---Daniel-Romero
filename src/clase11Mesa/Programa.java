package clase11Mesa;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(10,"Romero",1026292408,2);
        Cliente cliente2 = new Cliente(8, "Rodriguez", 1205,52);
        CuentaCorriente cc1 = new CuentaCorriente(5000,200, cliente1,500);
        CuentaDeAhorro ca1 = new CuentaDeAhorro(500,400,cliente2);
        cc1.depositar(50);
        System.out.println(cc1.getSaldo());
        cc1.extraer(1);
        System.out.println(cc1.getSaldo());
        ca1.cobrarIntereses(10);
        System.out.println(ca1.getSaldo());
        ca1.extraer(600);
        System.out.println(ca1.getSaldo());
    }
}
