package clase14;

public class Programa {
    public static void main(String[] args) {
        Embarcacion ev = new Velero(500,100,2018,5,3);
        Embarcacion ev2 = new Velero(500,100,2021,5,6);
        Embarcacion ey = new Yate(400,50,2021,4,6);
        Embarcacion ey2 = new Yate(250,40,1990,5,8);
        Embarcacion ey3 = new Yate(250,40,1990,5,8);

        System.out.println("El monto de alquiler es: "+ ev.calcularMonto());
        System.out.println("El monto de alquiler es: "+ ev2.calcularMonto());

        System.out.println(((Velero)ev).evaluar());
        System.out.println(((Velero)ev2).evaluar());

        System.out.println(((Yate)ey).compareTo((Yate)ey2));
        System.out.println(((Yate)ey2).compareTo((Yate)ey));
        System.out.println(((Yate)ey3).compareTo((Yate)ey2));
    }
}
