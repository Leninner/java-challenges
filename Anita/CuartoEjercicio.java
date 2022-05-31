package Anita;

import java.util.Scanner;

public class CuartoEjercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa el número para generar la serie");
    System.out.print("-> ");
    int numero = scan.nextInt();
    int aux = numero;
    scan.close();

    System.out.println("");

    for (int i = 1; i <= 15; i++) {
      System.out.print(numero + " - ");

      numero += aux;
    }
  }
}
