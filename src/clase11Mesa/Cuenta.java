package clase11Mesa;

public abstract class Cuenta {
    private double saldo;
    private double monto;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double monto){
        saldo+=monto;
    };

    public double informarSaldo(){
        return saldo;
    };

    public abstract void extraer(double monto);

    public Cuenta(double saldo, double monto, Cliente cliente) {
        this.saldo = saldo;
        this.monto = monto;
        this.cliente = cliente;
    }
}
