package src;

import java.util.Scanner;

public class CollatzConjectureRevisited {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Ingresa un número entero positivo: ");

    int collatzConjectures = scan.nextInt();
    scan.close();

    for (int i = 1; i <= collatzConjectures; i++) {
      int j = i;

      System.out.print(i + ": *");

      while (j > 1) {
        System.out.print(" *");

        if (j % 2 == 0) {
          j /= 2;
        } else {
          j = (j * 3) + 1;
        }

      }

      System.out.println("");
    }
  }
}
