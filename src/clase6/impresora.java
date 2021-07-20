package clase6;

public class impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFAbricacion;
    private int hojasDisponibles;
    private int maxHojas;
    private String color;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getFechaFAbricacion() {
        return fechaFAbricacion;
    }

    public void setFechaFAbricacion(String fechaFAbricacion) {
        this.fechaFAbricacion = fechaFAbricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public int getMaxHojas() {
        return maxHojas;
    }

    public void setMaxHojas(int maxHojas) {
        this.maxHojas = maxHojas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean tienePapel(){
        return hojasDisponibles>0;
    }

    public void imprimir(String texto){
        if (tienePapel()){
            System.out.println("Imprimiendo el siguiente texto "+texto);
            hojasDisponibles--;
        }else{
            System.out.println("No podemos imprimir");
        }
    }

    public void encender(){
        System.out.println("Encendiendo impresora");
    }

    public void apagar(){
        System.out.println("Apagando impresora");
    }

    public impresora(String modelo, String tipoConexion, String fechaFAbricacion, int maxHojas) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFAbricacion = fechaFAbricacion;
        this.maxHojas = maxHojas;
    }

    public impresora(String modelo, String tipoConexion, int maxHojas) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.maxHojas = maxHojas;
    }
}
