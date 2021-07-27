package clase26;
public class Vacuna {
    private StrategyVacunas tipoVacuna;

    public void vacunar(Persona paciente){
        tipoVacuna.vacunar(paciente);
    }
    public Vacuna(StrategyVacunas tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public StrategyVacunas getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(StrategyVacunas tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }
}