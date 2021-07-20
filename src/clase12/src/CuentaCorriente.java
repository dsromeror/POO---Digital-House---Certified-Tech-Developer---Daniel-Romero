package clase12.src;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto{
	
	private double descubiertoPermitido;
	
	

	public double getDescubiertoPermitido() {
		return descubiertoPermitido;
	}



	public void setDescubiertoPermitido(double descubiertoPermitido) {
		this.descubiertoPermitido = descubiertoPermitido;
	}



	@Override
	public void extraer(double monto) {
		if(informarSaldo() + descubiertoPermitido <= monto)
			setSaldo(informarSaldo() - monto);
	}

	@Override
	public double gravar(double porcentaje){
		double monto = informarSaldo()*porcentaje;
		setSaldo(informarSaldo()-monto);
		return monto;
	}

	public int compareTo(Object o){
		return 0;
	}
}
