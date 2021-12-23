import java.util.Scanner;

public class CuadradoDeUnaSuma {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
      System.out.print("Ingrese un número: ");
      float numberOne = scan.nextFloat();
      System.out.print("Ingrese otro número: ");
      float numberTwo = scan.nextFloat();

      // Para usar Math.pow se necesita declarar una variable double
      double result = Math.pow(numberOne, 2) + (2 * (numberOne * numberTwo)) + Math.pow(numberTwo, 2);

      System.out.println("El resultado es: " + result);
    }
  }
}
