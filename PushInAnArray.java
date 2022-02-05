// Reto: Pedir al usuario 5 datos, entre positivos y negativos y regresar la media de positivos y negativos y el conteo de ceros.

import java.util.Scanner;

public class PushInAnArray {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      int[] numbers = new int[5];

      for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter a number: ");
        numbers[i] = scan.nextInt();
      }

      int sumPos = 0, sumNeg = 0, contZeros = 0, contPositives = 0, contNegatives = 0;

      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == 0) {
          contZeros++;
        } else if (numbers[i] > 0) {
          sumPos += numbers[i];
          contPositives++;
        } else {
          sumNeg += numbers[i];
          contNegatives++;
        }
      }

      System.out.println("The average of the positive numbers is: " + sumPos / contPositives);
      System.out.println("The average of the negative numbers is: " + sumNeg / contNegatives);
      System.out.println("The number of zeros is: " + contZeros);
    }

  }
}
