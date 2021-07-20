package clase21Mesa;

public interface ReparacionState {
    void valorPresupuesto(double v);
    void sumaRepuesto(double v);
    void cambiarDireccion(String v);
    void pasarSigPaso();
}
