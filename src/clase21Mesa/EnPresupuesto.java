package clase21Mesa;

public class EnPresupuesto implements ReparacionState {
    private Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
        System.out.println("En reparación");
    }

    @Override
    public void valorPresupuesto(double v) {
        //r.setPresupuestado(v);
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
        r.setReparacionState(FactoryReparacionState.getInstance().obtenerReparacionState("EnProceso", r));
    }
}
