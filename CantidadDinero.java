import java.util.Scanner;

public class CantidadDinero {
  public static void main(String[] args) {
    try(Scanner entrada = new Scanner(System.in)){
      System.out.print("Ingrese la cantidad de dinero de Guillermo: ");
      float guillermo = entrada.nextFloat();
      float luis = guillermo / 2;
      float juan = (luis + guillermo) / 2;

      System.out.println("La suma de los tres es: " + (guillermo + luis + juan));
    }
  }
}
