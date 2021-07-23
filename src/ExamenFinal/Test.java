package ExamenFinal;

public class Test {
    public static void main(String[] args) {
        //Creo un servicio simple
        Servicio aire = ServicioFactory.getInstance().crearServicio("Simple");
        //Cargo datos del servicio creado
        aire.setNombre("Venta de aire acondicionado");
        aire.setDescripcion("Servicio de venta de aire acondicionado");
        ((Simple)aire).setPrecio(65000);
        //Creo un servicio simple con nombre Colocación
        Servicio coloca = ServicioFactory.getInstance().crearServicio("Simple");
        //Cargo datos del servicio creado
        coloca.setNombre("Colocación");
        coloca.setDescripcion("Servicio simple de colocación");
        ((Simple)coloca).setPrecio(10000);
        //Creo un combo de servicios
        Servicio combo = ServicioFactory.getInstance().crearServicio("Combo");
        //Cargo los servicios al combo
        combo.setNombre("Combo de servicios");
        combo.setDescripcion("Combo de servicios simples de aire acondicionado y colocación");
        ((Combo)combo).setDescuento(10);
        ((Combo)combo).agregar(aire);
        ((Combo)combo).agregar(coloca);
        //Creo la empresa
        Empresa empresa = new Empresa();
        empresa.setNombre("Examen final POO");
        //Agrego los servicios para validar condiciones de calcularPrecio
        empresa.agregar(aire);
        empresa.agregar(coloca);
        empresa.agregar(combo);
        System.out.println("*************************************************");
        System.out.println("Bienvenido a la empresa "+empresa.getNombre());
        System.out.println("-------------------------------------------------");
        System.out.println("Los siguientes servicios son los cargados:");
        System.out.println("-------------------------------------------------");
        empresa.mostrarServicios();
        System.out.println("*************************************************");
    }
}
