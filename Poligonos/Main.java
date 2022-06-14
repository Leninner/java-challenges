package Poligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Poligono> poligonos = new ArrayList<>();

    public static void main(String[] args) {
        // Método para llenar polígonos
        llenarPoligono();

        // Método para imprimir polígonos
        imprimirPoligonos();
    }

    public static void llenarPoligono() {
        int opcion;
        String respuesta;

        do {
            do {
                System.out.println("¿Qué polígono desea llenar?");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                opcion = scan.nextInt();
            } while(opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }

            System.out.println("Desea introducir otro polígono? (1. Si, 2. No)");
            respuesta = scan.next().charAt(0) == '1' ? "Si" : "No";
            System.out.println("");
        } while (respuesta.equalsIgnoreCase("Si"));
    }

    public static void llenarTriangulo() {
        double firstSide, secondSide, thirdSide;

        System.out.println("Ingrese el valor del primer lado:");
        firstSide = scan.nextDouble();

        System.out.println("Ingrese el valor del segundo lado:");
        secondSide = scan.nextDouble();

        System.out.println("Ingrese el valor del tercer lado:");
        thirdSide = scan.nextDouble();

        poligonos.add(new Triangulo(firstSide, secondSide, thirdSide));
    }

    public static void llenarRectangulo() {
        double base, altura;

        System.out.println("Ingrese el valor de la base:");
        base = scan.nextDouble();

        System.out.println("Ingrese el valor de la altura:");
        altura = scan.nextDouble();

        poligonos.add(new Rectangulo(base, altura));
    }

    public static void imprimirPoligonos() {
        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString() + "\n");
        }
    }
}
