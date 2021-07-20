package clase17Mesa;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;

    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaExcepcion{
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.before(hoy))
            throw new FechaExcepcion("La fecha de internación no puede ser posterior al día de hoy");
            this.fechaInternacion = fechaInternacion;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws FechaExcepcion {
        if (!fechaAlta.after(fechaInternacion))
            throw new FechaExcepcion("La fecha no puede ser anterior a la internación");
        System.out.println("Ok");
    }
}
