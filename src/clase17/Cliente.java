package clase17;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnCuenta;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double saldoEnCuenta, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        saldoEnCuenta = 0.0;
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public void setSaldoEnCuenta(double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void comprar (double importe) throws ClienteExcepcion{
        if (saldoEnCuenta+importe>limite)
            throw new ClienteExcepcion("No tiene limite disponible");
        saldoEnCuenta+=importe;
    }
    public void saldarDeuda(double importe) throws ClienteExcepcion{
        if (saldoEnCuenta<=0)
            throw new ClienteExcepcion("No tiene deuda");
        saldoEnCuenta-=importe;
    }
    @Override
    public String toString(){
        return "Cliente{" +
                nombre + ' ' +
                apellido + ' ' +
                ", su saldo es=" + saldoEnCuenta + "$ }";
    }
}
