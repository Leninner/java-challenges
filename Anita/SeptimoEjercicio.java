package Anita;

import java.util.Scanner;

public class SeptimoEjercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero = 0;

    do {
      System.out.println("\nIngresa un número entre 0 y 9999");
      System.out.print("-> ");
      numero = scan.nextInt();

      if (numero != 0) {
        int contador = 0;
        int auxNumero = numero;

        while (auxNumero > 0) {
          auxNumero /= 10;
          contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos");
      }
    } while (numero != 0);

    scan.close();
  }
}
