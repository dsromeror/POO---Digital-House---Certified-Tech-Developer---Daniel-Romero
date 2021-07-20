package clase11Mesa;

public class CuentaDeAhorro extends Cuenta{

    public CuentaDeAhorro(double saldo, double monto, Cliente cliente) {
        super(saldo, monto, cliente);
    }

    @Override
    public void extraer(double monto){
        if (monto<=getSaldo()){
            setSaldo(getSaldo()-monto);
        }else{
            System.out.println("No se puede retirar");
        }
    }

    public void cobrarIntereses(double interes){
        setSaldo(getSaldo()+getSaldo()*(interes/100));
    }
}
