package clase3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ejercitacion2 {

    static Integer cualGana (Integer jugadaA, Integer jugadaB){
        switch (jugadaA){
            case 1:
                if (jugadaB == 1){
                    return 0;
                }else if(jugadaB == 2){
                    return 2;
                }else if(jugadaB == 3){
                    return 1;
                }
                break;
            case 2:
                if (jugadaB == 1){
                    return 1;
                }else if(jugadaB == 2){
                    return 0;
                }else if(jugadaB == 3){
                    return 2;
                }
                break;
            case 3:
                if (jugadaB == 1){
                    return 1;
                }else if(jugadaB == 2){
                    return 2;
                }else if(jugadaB == 3){
                    return 0;
                }
                break;
        }
        return 0;
    }

    public static void main (String[] args) {
        String nombreJugadorA, nombreJugadorB, jugadaA = "  ", jugadaB;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos a jugar Piedra, Papel o Tijera");
        System.out.print("Ingresar el nombre del jugador A: ");
        nombreJugadorA = scanner.next();
        System.out.print("Ingresar el nombre del jugador B: ");
        nombreJugadorB = scanner.next();

        while (jugadaA.equals("*") != true){
            System.out.println("Ingresar la jugada del jugador A - Piedra(1) - Papel(2) - Tijera(3): ");
            jugadaA = scanner.next();
            if (jugadaA.equals("*")){
                break;
            }
            System.out.println("Ingresar la jugada del jugador B - Piedra(1) - Papel(2) - Tijera(3): ");
            jugadaB = scanner.next();

            Integer jugadaANum = parseInt(jugadaA);
            Integer jugadaBNum = parseInt(jugadaB);

            Integer decision = cualGana(jugadaANum, jugadaBNum);
            System.out.println(decision);
        }
    }
}
