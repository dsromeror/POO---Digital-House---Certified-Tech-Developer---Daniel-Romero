package clase2;

import java.util.Scanner;

public class Ejercitacion_1 {
    public static boolean esDivisible(int n, int divisor) {
        return (n % divisor) == 0;
    }

    public static String esPrimo (int numero){
        String answer = "es primo";
        for (int n=2; n<numero; n++){
            if(esDivisible(numero,n)){
                answer = "no es primo";
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();
        System.out.println("El número " + numero + " " + esPrimo(numero));

    }
}
