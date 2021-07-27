package clase26;

public class Moderna implements StrategyVacunas{

    @Override
    public void vacunar(Persona paciente) {
        paciente.incrementarDosis();
        if (paciente.getCantidadDosis()==2){
            System.out.println("El paciente "+paciente.getNombre()+" está totalmente vacunado con Moderna");
        }
        else{
            System.out.println("El paciente "+paciente.getNombre()+ "le falta una dosis de Moderna");
        }
    }
}