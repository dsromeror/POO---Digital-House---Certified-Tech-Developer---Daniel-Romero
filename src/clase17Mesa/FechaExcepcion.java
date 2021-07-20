package clase17Mesa;

public class FechaExcepcion extends Exception{
    public FechaExcepcion(){
        super();
    }
    public FechaExcepcion(String mensaje){
        super(mensaje);
    }
    public String toString(){
        return "Error de tipo: "+this.getClass().getName()+" "+getMessage();
    }
}
