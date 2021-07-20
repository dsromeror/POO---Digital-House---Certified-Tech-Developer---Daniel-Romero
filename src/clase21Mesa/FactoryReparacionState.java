package clase21Mesa;

public class FactoryReparacionState {
    private static FactoryReparacionState instance;

    private FactoryReparacionState(){

    }

    public static FactoryReparacionState getInstance(){
        if (instance == null)
            instance = new FactoryReparacionState();
        return instance;
    }

    public ReparacionState obtenerReparacionState(String tipo, Reparacion r){
        ReparacionState resultado = null;

        return resultado;
    }
    /*
    public Producto crearProducto(String tipo){
        Producto resultado = null;
        switch (tipo){
            case "CAJA10X10":
                resultado = new Caja();
                break;
            case "PELOTAFUTBOL":
                resultado = new Pelota();
                break;
            case "PELOTATENIS":
                resultado = new Pelota();
                break;
        }
        return resultado;
    }
     */
}
