package clase21Mesa;

public class ParaEnvio implements ReparacionState{
    private Reparacion r;

    public ParaEnvio(Reparacion r) {
        this.r = r;
        System.out.println("Para envio");
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
        r.getReparacionState().cambiarDireccion(v);
    }

    @Override
    public void pasarSigPaso() {
        r.setReparacionState(new Finalizando(r));
    }
}
