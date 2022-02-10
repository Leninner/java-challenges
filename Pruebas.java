import java.util.Scanner;

public class Pruebas {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Introduce el primer número: ");
      int numberOne = scan.nextInt();
      System.out.println("Introduce el segundo número: ");
      int numberTwo = scan.nextInt();

      int result = numberOne % numberTwo;

      if (result == 0) {
        System.out.println("El número " + numberOne + " es múltiplo de " + numberTwo);
      } else {
        System.out.println("Vuelve a la escuela por favor");
      }
    }
  }
}