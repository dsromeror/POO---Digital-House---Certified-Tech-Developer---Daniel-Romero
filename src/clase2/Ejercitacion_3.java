package clase2;

import java.util.Scanner;

public class Ejercitacion_3 {
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        boolean ans = true;
        if (unTextoA == unTextoB){
            ans = false;
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unTextoA, unTextoB;

        System.out.println("Ingrese la primer cadena: ");
        unTextoA = scanner.next();
        System.out.println("Ingrese la segunda cadena: ");
        unTextoB = scanner.next();

        System.out.println(cadenasDeTextoDistintas(unTextoA, unTextoB));
    }
}
