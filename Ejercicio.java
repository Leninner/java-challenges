import java.util.Scanner;

public class Ejercicio {
  public static void main(String[] args) {
    /**
     * Resolver una ecuación lineal: y = (x + 3)^2
     */

    float valorNegativo, valorPositivo, aumento;

    try(Scanner scan = new Scanner(System.in)){
      System.out.print("Dime un valor negativo para tu tabla de valores: ");
      valorNegativo = scan.nextFloat();
      System.out.print("Dime un valor positivo para tu tabla de valores: ");
      valorPositivo = scan.nextFloat();
      System.out.print("Pasos: ");
      aumento = scan.nextFloat();
  
      for (float i = valorNegativo; i <= valorPositivo; i += (aumento)) {
        System.out.println("El valor en y, cuando x vale " + i + " es " + Math.pow((i + 3), 2));
      }
    }
  }
}
