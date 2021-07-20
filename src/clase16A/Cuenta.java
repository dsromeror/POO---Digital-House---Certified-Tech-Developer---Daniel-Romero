package clase16A;

import Examen.Licenciatura;

public class Cuenta implements Comparable{
    private int nroCuenta;
    private double saldo;

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object o) {
        Cuenta comparando = (Cuenta) o;
        int resultado = 0;
        if (getSaldo() > comparando.getSaldo())
            resultado = 1;
        else if (getSaldo() < comparando.getSaldo())
            resultado = -1;
        return resultado;
    }

}
