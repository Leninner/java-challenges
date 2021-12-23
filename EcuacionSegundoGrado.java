import java.util.Scanner;

public class EcuacionSegundoGrado {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
      // FIXME: Arreglar el problema de NaN
      
      double a, b, c, x1, x2;

      System.out.print("Ingrese el valor de a: ");
      a = scan.nextDouble();
      System.out.print("Ingrese el valor de b: ");
      b = scan.nextDouble();
      System.out.print("Ingrese el valor de c: ");
      c = scan.nextDouble();

      x1 =(float) (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
      x2 =(float) (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

      System.out.println(x1);
      System.out.println(x2);
    }
  }
}
