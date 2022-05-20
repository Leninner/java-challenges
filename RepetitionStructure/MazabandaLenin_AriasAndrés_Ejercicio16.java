package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio16 {
  /**
   * Que calcule la media de X números, se dejarán de solicitar números hasta que
   * se
   * introduzca el cero.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number = 0;
    int sum = 0;
    int counter = 0;

    do {
      System.out.println("Ingrese un número: ");
      System.out.print("-> ");
      number = scan.nextInt();

      if (number == 0) {
        System.out.println("\nLa media de los números ingresados diferentes de 0 es: " + (sum / counter));
      } else {
        sum += number;
        counter++;
      }

    } while (number != 0);

    scan.close();
  }
}
