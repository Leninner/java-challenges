package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio18 {
  // Que pida un número y diga si es primo o no.

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

      System.out.println("\nEl número " + number + " es primo? ");

      boolean isPrime = true;

      for (int i = 2; i < number / 2; i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.println("\t-> Sí");
      } else {
        System.out.println("\t-> No");
      }

    } while (number <= 0);

    scan.close();
  }
}
