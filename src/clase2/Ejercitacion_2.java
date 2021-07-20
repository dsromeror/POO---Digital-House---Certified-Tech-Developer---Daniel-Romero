package clase2;

import java.util.Scanner;

public class Ejercitacion_2 {
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer mayor;
        if (unNumeroA>unNumeroB){
            mayor = unNumeroA;
        }else if(unNumeroB>unNumeroC){
            mayor = unNumeroB;
        }else{
            mayor = unNumeroC;
        }
        return mayor;
    }

    public static void main(String[] args) {
        Integer unNumeroA, unNumeroB, unNumeroC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        unNumeroA = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        unNumeroB = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        unNumeroC = scanner.nextInt();
        System.out.println("El número mayor es: " + maximoEntreTresNumeros(unNumeroA,unNumeroB,unNumeroC));
    }
}
