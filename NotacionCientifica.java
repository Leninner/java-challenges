import java.util.Scanner;

public class NotacionCientifica {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Ingresa un número para convertirlo a notación científica");
      float number = scan.nextFloat();
      int digitos = 0;
      float z = number;

      if (number > 1) {
        // Valores grandes
        while (number > 10) {
          number /= 10;
          digitos++;
        }
      } else {
        // Valores pequeños
        while (number < 1) {
          number *= 10;
          digitos++;
        }
      }

      System.out.println("Tu número " + z + " convertido a notación científica es: "
          + (double) Math.round(number * 1000d) / 1000 + " x 10^" + digitos);
    } catch (Exception e) {
      System.out.println("Ocurrió un error en el ingreso de datos, portate vivo, por favor");
    }
  }
}