package clase19Mesa;

public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory(){

    }

    public static ProductoFactory getInstance(){
        if (instance == null)
            instance = new ProductoFactory();
        return instance;
    }

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
}
