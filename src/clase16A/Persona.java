package clase16A;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas = new ArrayList<>();

    public void incorporarCuenta (Cuenta cuenta){
        cuentas.add(cuenta);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCompleto(){
        return getNombre() + " " + getApellido();
    }

    public boolean esMayorEdad(){
        return edad>=60;
    }

    public double getSaldoTotal(){
        double total = 0.0;
        for (Cuenta cuenta: cuentas)
            total += cuenta.getSaldo();

        return total;
    }

    public void mostrarCuentas(){
        for (Cuenta cuenta: cuentas)
            System.out.println(cuenta.getNroCuenta());
    }
}
