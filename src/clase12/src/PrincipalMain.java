package clase12.src;

public class PrincipalMain {

	public static void main(String[] args) {

		Cuenta ca = new CajaAhorro();
		Cuenta cc = new CuentaComitente();

		cc.setSaldo(1000);
		ca.setSaldo(100);
		ca.extraer(10);
		double monto = ((CuentaCorriente)cc).gravar(0.2);
		System.out.println("Imp. recaudado de cc: " + monto);
		System.out.println("Saldo de cc: " + cc.informarSaldo());
		/*
		ca.setSaldo(100);
		ca.extraer(50);
		((CajaAhorro)ca).cobrarIntereses();
		System.out.println(ca.informarSaldo());

		cc.setSaldo(1000);
		cc.depositar(100);
		System.out.println(cc.informarSaldo());
		cc.extraer(500);
		System.out.println(cc.informarSaldo());
		((CuentaComitente)cc).setCNV("hola");
		((CuentaComitente)cc).extraer(200, "hola");
		System.out.println(cc.informarSaldo());
		((CuentaComitente)cc).extraer(200, "holam");
		System.out.println(cc.informarSaldo());*/
		
	}

}
