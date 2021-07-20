package clase17Mesa;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,2021));
        } catch (FechaExcepcion e) {
            System.err.println(e);
        }
        try {
            Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(2021,7,21));
            paciente.darAlta(new Date(2021,7,20));
        }catch (FechaExcepcion e){
            System.err.println(e);
        }
    }
}
