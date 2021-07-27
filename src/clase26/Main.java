package clase26;
public class Main {
    public static void main(String[] args) {
        Vacuna laVacuna;
        Persona paciente;

        //Oxford
        laVacuna= new Vacuna(new Oxford());
        paciente= new Persona("Luis");
        laVacuna.vacunar(paciente);

        //Pfizer
        laVacuna= new Vacuna(new Pfizer());
        paciente= new Persona("María");
        laVacuna.vacunar(paciente);

        //Sputnik
        laVacuna= new Vacuna(new Sputnik());
        paciente= new Persona("Pedro");
        laVacuna.vacunar(paciente);

        //Moderna
        laVacuna= new Vacuna(new Moderna());
        paciente= new Persona("Clara");
        laVacuna.vacunar(paciente);
        laVacuna.vacunar(paciente);
    }
}