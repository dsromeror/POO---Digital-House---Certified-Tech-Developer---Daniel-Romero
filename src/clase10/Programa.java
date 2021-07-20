package clase10;

public class Programa {
    public static void main(String[] args) {
        Socio s1 = new Socio("A0001","Daniel", "Gimnasio", 1400);
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        Socio s2 = new Socio("A0001", "Steven", "Pesas", 1800);
        System.out.println(s1.equals(s2));
        System.out.println(s2.cuotaMensual());
        SocioHabilitado s3 = new SocioHabilitado("A00030", "Juan", "Pesas", 2000, 500);
        System.out.println(s3.cuotaMensual());
    }
}
