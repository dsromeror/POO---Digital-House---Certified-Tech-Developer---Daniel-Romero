package clase4;

public class Cliente {
    private String numeroCliente;
    private String nombre;
    private Double deuda;

    public String getNumeroCliente(){
        return numeroCliente;
    }

    public String getNombre(){
        return nombre;
    }

    public  Double getDeuda(){
        return deuda;
    }

    public void setNumeroCliente(String numeroCliente){
        this.numeroCliente = numeroCliente;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDeuda(Double deuda){
        this.deuda = deuda;
    }

    public Cliente (String numero, String nombre){
        numeroCliente = numero;
        this.deuda = 0.0;
        this.nombre = nombre;
    }

    public void incrementarDeuda (Double valor){
        deuda+=valor;
    }

    public void pagarDeuda(){
        deuda = 0.0;
    }
}
