package clase16A;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Alumno al1 = new Alumno("Daniel");
        al1.ingresarNota(5.0);
        al1.ingresarNota(3.0);
        System.out.println(al1.calcularPromedio());

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNroCuenta(123);
        cuenta1.setSaldo(5000);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNroCuenta(234);
        cuenta2.setSaldo(5);

        Cuenta cuenta3 = new Cuenta();
        cuenta3.setNroCuenta(4541);
        cuenta3.setSaldo(5548);

        Persona persona1 = new Persona();
        persona1.setNombre("Daniel");
        persona1.setApellido("Romero");
        persona1.setEdad(25);
        persona1.incorporarCuenta(cuenta1);
        persona1.incorporarCuenta(cuenta2);

        Persona persona2 = new Persona();
        persona2.setNombre("Gloria");
        persona2.setApellido("Rodríguez");
        persona2.setEdad(60);
        persona2.incorporarCuenta(cuenta3);

        System.out.println(persona1.getNombreCompleto());
        if (persona1.esMayorEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }

        System.out.println("Mostramos las cuentas de esta persona: ");
        persona1.mostrarCuentas();
        System.out.println("Su saldo total es:");
        System.out.println(persona1.getSaldoTotal());

        System.out.println(persona2.getNombreCompleto());
        if (persona2.esMayorEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        System.out.println("Mostramos las cuentas de esta persona: ");
        persona2.mostrarCuentas();
        System.out.println("Su saldo total es:");
        System.out.println(persona2.getSaldoTotal());

    }
}
