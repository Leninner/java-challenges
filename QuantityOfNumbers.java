import java.util.Scanner;

public class QuantityOfNumbers {
  public static void main(String[] args) {
    int cont = 0;

    try(Scanner scan = new Scanner(System.in)){
      System.out.println("Ingresa un número");
      double number = scan.nextDouble();

      while(number >= 0) {
        cont++;
        System.out.println("Ingresa otro número");
        number = scan.nextDouble();
      }
  
      System.out.println("La cantidad de números ingresados fueron: " + cont);
    };
  }
}
