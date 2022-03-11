import java.util.Scanner;

public class Potencia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float base, exponent;

    System.out.println("Dime la base");
    base = scan.nextFloat();

    System.out.println("Dime el exponente");
    exponent = scan.nextFloat();

    scan.close();

    float potencia = (float) Math.pow(base, exponent);
    float division = potencia / base;
    float finalResult = (float) Math.pow(potencia, division);

    System.out.println("El resultado final es " + finalResult);
  }
}
