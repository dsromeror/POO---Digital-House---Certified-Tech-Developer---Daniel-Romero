package clase6MesaTrabajo;

public class Programa {
    public static void main(String[] args) {
        InstitucionAdopcion i = new InstitucionAdopcion(true, 2003, 5.6, true, false, "firulais");
        System.out.println("El perro se llama: " + i.getNombrePerro() +" y tiene: " + i.edadPerro() + " años" + " se puede adoptar: " + i.sePuedeAdoptar() + " puede perderse: " + i.puedePerderse());
        i.setAnioNacimiento(2017);
        i.setNombrePerro("Pepito");
        i.setAdopcion(false);
        i.setChip(false);
        System.out.println("El perro se llama: " + i.getNombrePerro() +" y tiene: " + i.edadPerro() + " años" +" se puede adoptar: " + i.sePuedeAdoptar() + " puede perderse: " + i.puedePerderse());
        i.setAnioNacimiento(2015);
        i.setNombrePerro("beto");
        i.setAdopcion(false);
        i.setChip(false);
        i.setPeso(2.0);
        System.out.println("El perro se llama: " + i.getNombrePerro() +" y tiene: " + i.edadPerro() + " años" +" se puede adoptar: " + i.sePuedeAdoptar() + " puede perderse: " + i.puedePerderse());
    }
}