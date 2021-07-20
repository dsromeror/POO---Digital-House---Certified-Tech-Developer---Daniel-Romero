package clase19;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresita");

        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Daniel");
        emp1.setApellido("Romero");
        emp1.setSueldoMensual(100000);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Steven");
        emp2.setApellido("Rodríguez");
        emp2.setImportePorHora(2500);
        emp2.setRetencionImpuesto(0.1);

        empresa.getEmpleados().add(emp1);
        empresa.getEmpleados().add(emp2);

        double totalSueldoEmpresa = empresa.calcularSueldoTotal(20);
        System.out.println("Total de sueldos a pagar: "+totalSueldoEmpresa);
    }
}
