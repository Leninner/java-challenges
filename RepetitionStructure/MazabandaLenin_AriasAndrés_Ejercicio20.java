package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio20 {
  /**
   * Que muestre la tabla de multiplicar (1-10) de un número cualquiera. El número
   * debe
   * ser ingresado por teclado.
   */

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

      System.out.println("\nTabla de multiplicar del número " + number + ": ");

      for (int i = 1; i <= 10; i++) {
        System.out.println("\t" + number + " x " + i + " = " + (number * i));
      }

    } while (number <= 0);

    scan.close();
  }
}
