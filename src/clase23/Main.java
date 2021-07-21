package clase23;

public class Main {
    public static void main(String[] args) {
        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        //Cargar datos del curso frontend
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("Curso de front");
        ((Curso) frontEnd).setCargaHorariaMensual(16);
        ((Curso) frontEnd).setCantidadMeses(2);
        ((Curso) frontEnd).setValorHora(1000);

        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        //Cargar datos del curso backend
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("Curso de back");
        ((Curso) backEnd).setCargaHorariaMensual(20);
        ((Curso) backEnd).setCantidadMeses(2);
        ((Curso) backEnd).setValorHora(900);

        OfertaAcademica fullstack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        //Cargar datos del curso fullstack
        fullstack.setNombre("Fullstack");
        fullstack.setDescripcion("Curso fullstack");
        ((ProgramaIntensivo) fullstack).setPorcentajeBonificacion(0.2);
        ((ProgramaIntensivo) fullstack).agregar(backEnd);
        ((ProgramaIntensivo) fullstack).agregar(frontEnd);
        //Curso con menos de 10 horas

        OfertaAcademica cursomenos = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        //Cargar datos del curso fullstack
        cursomenos.setNombre("Curso con menos de 10 horas");
        cursomenos.setDescripcion("Curso con menos de 10 horas");
        ((Curso) cursomenos).setCargaHorariaMensual(9);
        ((Curso) cursomenos).setCantidadMeses(2);
        ((Curso) cursomenos).setValorHora(10);

        OfertaAcademica taller = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Taller");
        taller.setNombre("Soft kills");
        taller.setDescripcion("Taller de habilidades blandas");
        ((Taller) taller).setCantidadTrabajos(5);
        ((Taller) taller).setPrecioCadaTrabajo(500);

        OfertaAcademica carrera = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Carrera");
        carrera.setNombre("Carrera DH");
        carrera.setDescripcion("Carrera Certified Tech Developer");
        ((Carrera) carrera).setValorBasico(500);

        try {
            ((Carrera)carrera).agregar(cursomenos);
        } catch (Exception e) {
            System.err.println("Error creando la carrera: "+carrera.getNombre()+" -> "+e.getMessage());
        }



        Instituto instituto = new Instituto("Instituto DR");
        instituto.agregar(frontEnd);
        instituto.agregar(backEnd);
        instituto.agregar(fullstack);
        instituto.agregar(taller);
        instituto.agregar(carrera);
        instituto.generarInforme();
    }
}
