package clase11Mesa;

public class CuentaCorriente extends Cuenta{
    private double descubiertoPermitido;

    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    public CuentaCorriente(double saldo, double monto, Cliente cliente, double descubiertoPermitido) {
        super(saldo, monto, cliente);
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(double monto){
        if (monto<=getSaldo()){
            setSaldo(getSaldo()-monto);
        }else if(monto<this.descubiertoPermitido){
            this.descubiertoPermitido += getSaldo() - monto;
        }
    }
}
