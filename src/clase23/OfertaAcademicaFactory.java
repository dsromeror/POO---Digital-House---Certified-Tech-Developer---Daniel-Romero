package clase23;

public class OfertaAcademicaFactory {
    private  static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance(){
        if (instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica (String tipo){
        switch (tipo){
            case "Curso":
                return new Curso();
            case "ProgramaIntensivo":
                return new ProgramaIntensivo();
            case "Carrera":
                return new Carrera();
            case "Taller":
                return new Taller();
            default:
                return null;
        }
    }
}
