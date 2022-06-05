package POOChallenge;

import java.util.Scanner;

public class Main {
    public static String getLargestPerimeter(Triangulo[] triangulos) {
        Triangulo maxPerimeter = triangulos[0];

        for (Triangulo triangulo : triangulos) {
            if (triangulo.getPerimeter() > maxPerimeter.getPerimeter()) {
                maxPerimeter = triangulo;
            }
        }
        return maxPerimeter.getInfo();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de triangulos: ");
        System.out.print("-> ");
        int n = scan.nextInt();

        Triangulo[] triangulos = new Triangulo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el lado uno y dos del triangulo " + (i + 1) + ": ");
            System.out.print("-> ");
            float sideOne = scan.nextFloat();

            System.out.println("Ingrese la base del triangulo " + (i + 1) + ": ");
            System.out.print("-> ");
            float base = scan.nextFloat();

            triangulos[i] = new Triangulo(sideOne, base);

        }

        System.out.println("El triangulo de mayor perimetro es: " +  getLargestPerimeter(triangulos));

    }
}
