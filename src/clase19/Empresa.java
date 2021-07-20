package clase19;

import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa(String razonSocial){
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public double calcularSueldoTotal (int dias){
    //calcular el costo total de los sueldos de los empleados según el parámetro días
        double total =0;
        for (Empleado emp: empleados) {
            total += emp.calcularSueldo(dias);
        }
        return total;
    }
}
