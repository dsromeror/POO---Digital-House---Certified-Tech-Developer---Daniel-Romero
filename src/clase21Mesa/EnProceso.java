package clase21Mesa;

public class EnProceso implements ReparacionState{
    private Reparacion r;

    public EnProceso(Reparacion r) {
        this.r = r;
        System.out.println("En reparación");
    }

    @Override
    public void valorPresupuesto(double v) {
        System.out.println("No disponible");
    }

    @Override
    public void sumaRepuesto(double v) {
        System.out.println("El valor total es: " + v);
    }

    @Override
    public void cambiarDireccion(String v) {
        System.out.println("No disponible");
    }

    @Override
    public void pasarSigPaso() {
        r.setReparacionState(new ParaEnvio(r));
    }
}
