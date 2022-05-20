package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio14 {
  // Que calcule el factorial de un número cualquiera y lo muestre en pantalla
  // Ejemplo:
  // 5! = 5 * 4 * 3 * 2 * 1 = 120

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number = 0;

    do {
      System.out.println("Ingrese un número: ");
      System.out.print("-> ");
      number = scan.nextInt();

      if (number < 1) {
        System.err.println("\nEl número debe ser mayor a 0. Intente de nuevo. \n");
        continue;
      }

      System.out.println("\nEl factorial de " + number + " es: ");

      int factorial = 1;

      for (int i = 1; i <= number; i++) {
        factorial *= i;
      }

      System.out.println("\t-> " + factorial);

    } while (number <= 0);

    scan.close();
  }
}
