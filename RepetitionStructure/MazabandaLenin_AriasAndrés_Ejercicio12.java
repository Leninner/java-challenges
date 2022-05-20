package RepetitionStructure;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio12 {
  // Que pida un número y muestre en pantalla el mismo número de asteriscos.
  // Ejemplo:
  // 1 -> *
  // 2 -> **
  // 3 -> ***

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

      System.out.println("\nEl número " + number + " en asteriscos es: ");

      for (int i = 1; i <= number; i++) {
        System.out.print("* ");
      }

      System.out.println("");

    } while (number <= 0);

    scan.close();
  }
}
