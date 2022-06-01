package src;

import java.util.Scanner;

public class EcuacionSegundoGrado {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {

      double valueA, valueB, valueC;

      System.out.print("Ingrese el valor de a: ");
      valueA = scan.nextDouble();

      System.out.print("Ingrese el valor de b: ");
      valueB = scan.nextDouble();

      System.out.print("Ingrese el valor de c: ");
      valueC = scan.nextDouble();

      double discriminante = Math.pow(valueB, 2) - 4 * valueA * valueC;

      if (valueA == 0 || valueB == 0 || valueC == 0) {
        System.out.println("No se puede resolver la ecuacion, no se aceptan valores iguales a 0");
      } else if (discriminante < 0) {
        System.out.println("No tiene soluciones reales");
      } else {
        double raizOne = (-valueB + Math.sqrt(discriminante)) / (2 * valueA);
        double raizTwo = (-valueB - Math.sqrt(discriminante)) / (2 * valueA);

        System.out.println(Math.round(raizOne));
        System.out.println(Math.round(raizTwo));
      }
    }
  }
}
