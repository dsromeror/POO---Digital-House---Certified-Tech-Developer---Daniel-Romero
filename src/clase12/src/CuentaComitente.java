package clase12.src;

public class CuentaComitente extends Cuenta{
    public static final double COMISION = 0.01;
    private String CNV;

    public String getCNV() {
        return CNV;
    }

    public void setCNV(String CNV) {
        this.CNV = CNV;
    }

    @Override
    public void depositar(double monto) {
        setSaldo(informarSaldo()+((monto)*(1-COMISION)));
    }

    @Override
    public void extraer(double monto){
        System.out.println("\nIntentando extraer: $" + monto);
        if (monto <= informarSaldo() * 0.5) {
            setSaldo(informarSaldo() - monto);
        }
    }

    public void extraer(double monto, String CNV) {
        if(this.CNV.equals(CNV) && monto <= informarSaldo()){
            setSaldo(informarSaldo() - monto);
        }
    }
}