package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio08 {
  /**
   * Que pida dos números y muestre todos los números pares que van desde el
   * primero
   * al segundo. Se debe controlar que los valores son correctos.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int firstNumber = 0;
    int secondNumber = 0;

    do {
      System.out.println("Ingrese el primer número: ");
      System.out.print("-> ");
      firstNumber = scan.nextInt();

      System.out.println("Ingrese el segundo número: ");
      System.out.print("-> ");
      secondNumber = scan.nextInt();

      if (firstNumber >= secondNumber) {
        System.err.println("\nEl primer número debe ser menor al segundo. Intente de nuevo. \n");
        continue;
      } else {
        System.out.println("\n\nLos números pares entre " + firstNumber + " y " + secondNumber + " son: \n");

        for (int i = firstNumber; i <= secondNumber; i++) {
          if (i % 2 == 0) {
            System.out.println("\t-> " + i);
          }
        }
      }

    } while (firstNumber >= secondNumber);

    scan.close();
  }
}
