package Anita;

import java.util.Scanner;

public class QuintoEjercicio {
  public static void main(String[] args) {
    // Necesitamos realizar un programa para cargar (ingresar) y contabilizar n
    // votos de dos
    // listas (A y B), al final hay que mostrar con un mensaje la lista que más
    // cantidad de
    // votantes tuvo.
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de personas que participaron en la elección");
    System.out.print("-> ");
    int n = scan.nextInt();

    int votosA = 0;
    int votosB = 0;

    for (int i = 1; i <= n; i++) {
      System.out.println("\nSelecciona una opción para la persona " + i);
      System.out.println("1. Voto para A");
      System.out.println("2. Voto para B");
      System.out.print("-> ");
      int voto = scan.nextInt();

      if (voto == 1) {
        votosA++;
      } else if (voto == 2) {
        votosB++;
      } else {
        System.out.println("\n\nOpción inválida. Voto nulo\n\n");
      }
    }

    scan.close();

    if (votosA > votosB) {
      System.out.println("\nLa lista A obtuvo más votos: " + votosA);
    } else if (votosB > votosA) {
      System.out.println("\nLa lista B obtuvo más votos: " + votosB);
    } else {
      System.out.println("\nAmbas listas obtuvieron el mismo número de votos: " + votosA);
    }
  }
}
