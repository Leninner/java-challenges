package src;

import java.util.Scanner;

public class CollatzConjecture {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Ingresa un número para generar la conjetura de collatz: ");
    int number = scan.nextInt();
    scan.close();

    while (number > 1) {
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number = (number * 3) + 1;
      }

      System.out.print(number + " - ");
    }
  }
}
