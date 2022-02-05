import java.util.Scanner;

public class MediaPosNegCero {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      float number, sumPos = 0, sumNeg = 0;
      int contPos = 0, contNeg = 0, contCeros = 0;

      for (int i = 0; i < 10; i++) {
        System.out.print("Ingresa números positivos y negativos: ");
        number = scan.nextFloat();

        if (number > 0) {
          contPos++;
          sumPos += number;
        } else if (number == 0) {
          contCeros++;
        } else {
          contNeg++;
          sumNeg += number;
        }
      }

      System.out.println("La media de número positivos es: " + (sumPos / contPos)
          + ".\nLa media de números negativos es: " + (sumNeg / contNeg) + ".\nLa cantidad de ceros es: " + contCeros);
    }
  }
}