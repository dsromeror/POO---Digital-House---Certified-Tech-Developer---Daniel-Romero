package clase21Mesa;

public class Finalizando implements ReparacionState{
    private Reparacion r;

    public Finalizando(Reparacion r) {
        this.r = r;
        System.out.println("Finalizando");
    }

    @Override
    public void valorPresupuesto(double v) {
        System.out.println("No disponible");
    }

    @Override
    public void sumaRepuesto(double v) {
        System.out.println("No disponible");
    }

    @Override
    public void cambiarDireccion(String v) {
        System.out.println("No disponible");
    }

    @Override
    public void pasarSigPaso() {
        System.out.println("No disponible");
    }
}
