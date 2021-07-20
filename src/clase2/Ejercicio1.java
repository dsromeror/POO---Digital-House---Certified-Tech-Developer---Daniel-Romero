package clase2;

import java.util.Scanner;

public class Ejercicio1 {
    static  String devolverFecha (String d, String m, String a){
        return d + "/" + m + "/" + a;
    }

    public static void main(String[] args){
        String apellido;
        String dia, mes, anio;
        String nombre;
        char inicialNombre, inicialApellido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.next();

        System.out.println("--- Mensaje solicitado ----");

        System.out.println("Nombre: " + nombre);
        inicialNombre = nombre.charAt(0);
        System.out.println("Inicial de nombre: " + inicialNombre);
        System.out.println("Ingrese su apellido: ");
        apellido = scanner.next();
        System.out.println("Apellido: " + apellido);
        inicialApellido = apellido.charAt(0);
        System.out.println("Inicial de apellido: " + inicialApellido);

        System.out.println("Ingrese el día: ");
        dia = scanner.next();
        System.out.println("Ingrese el mes: ");
        mes = scanner.next();
        System.out.println("Ingrese el año: ");
        anio = scanner.next();
        System.out.println("Fecha de nacimiento: " + devolverFecha(dia, mes, anio));
    }
}
