package clase11;

public class Programa {
    public static void main(String[] args) {
        ImpresoraEpson i1 = new ImpresoraEpson();
        System.out.println(i1.imprimir());
        ImpresoraCannon i2 = new ImpresoraCannon();
        System.out.println(i2.imprimir());
        i1.setPorcentajeTinta(15);
        i2.setPorcentajeTinta(15);
        System.out.println(i1.necesitaTinta());
        System.out.println(i2.necesitaTinta());

        Impresora i3 = new ImpresoraEpson();
        System.out.println(i3.imprimir());
    }
}
