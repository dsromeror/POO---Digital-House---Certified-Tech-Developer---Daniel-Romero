package clase26;
public class Oxford implements StrategyVacunas{
    @Override
    public void vacunar(Persona paciente) {
        paciente.incrementarDosis();
        System.out.println("El paciente "+paciente.getNombre()+" ya esta totalmente vacunado con una monodosis de Oxford");
    }
}