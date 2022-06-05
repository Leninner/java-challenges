package POOChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número de atletas: ");
        int numberAtletas = scan.nextInt();

        Atletismo[] atletas = new Atletismo[numberAtletas];

        for (int i = 0; i < numberAtletas; i++) {
            System.out.println("Ingrese el número de atleta: ");
            System.out.print("-> ");
            int numberAtleta = scan.nextInt();

            System.out.println("Ingrese el nombre del atleta: ");
            System.out.print("-> ");
            String nameAtleta = scan.next();

            System.out.println("Ingrese el tiempo del atleta: ");
            System.out.print("-> ");
            double timeAtleta = scan.nextDouble();

            atletas[i] = new Atletismo(numberAtleta, nameAtleta, timeAtleta);
        }

        Atletismo winnerAtleta = atletas[0];

        for (int i = 0; i < numberAtletas; i++) {
            if (atletas[i].getTimeAtleta() < winnerAtleta.getTimeAtleta()) {
                winnerAtleta = atletas[i];
            }
        }

        System.out.println("El atleta ganador de la carrera es: " + winnerAtleta.getAtletaInfo());
    }
}
