package Anita;

import java.util.Scanner;

public class SextoEjercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sumaLista1 = 0;
    int sumaLista2 = 0;

    System.out.println("Ingresa datos de la lista 1\n\n");

    for (int i = 1; i <= 15; i++) {
      System.out.println("Ingresa valor " + i);
      System.out.print("-> ");

      sumaLista1 += scan.nextInt();
    }

    System.out.println("\n\nIngresa datos de la lista 2\n\n");

    for (int i = 1; i <= 15; i++) {
      System.out.println("Ingresa valor " + i);
      System.out.print("-> ");

      sumaLista2 += scan.nextInt();
    }

    scan.close();

    if (sumaLista1 > sumaLista2) {
      System.out.println("\nLista 1 mayor");
    } else if (sumaLista2 > sumaLista1) {
      System.out.println("\nLista 2 mayor");
    } else {
      System.out.println("\nListas iguales");
    }
  }
}
