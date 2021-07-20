package clase17;

public class ClienteExcepcion extends Exception{
    public ClienteExcepcion(){
        super();
    }
    public ClienteExcepcion(String mensaje){
        super(mensaje);
    }
    public String toString(){
        return "Nombre "+ this.getClass().getName()+"Mensaje "+getMessage();
    }
}
