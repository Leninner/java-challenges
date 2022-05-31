package Anita;

import java.util.Scanner;

public class TercerEjercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double valorCompra = 0;
    int cantidadEntre50y150 = 0;
    int cantidadMas150 = 0;

    System.out.println("Ingresa la cantidad de productos");
    System.out.print("-> ");
    int n = scan.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("\nIngresa el valor de compra del artículo " + i);
      System.out.print("-> ");
      valorCompra = scan.nextDouble();

      if (valorCompra >= 50 && valorCompra <= 300) {
        System.out.println("El valor de compra del artículo " + i + " es: " + valorCompra);
      }

      if (valorCompra >= 50 && valorCompra <= 150) {
        cantidadEntre50y150++;
      } else if (valorCompra > 150) {
        cantidadMas150++;
      }
    }

    scan.close();

    System.out.println("\nHay " + cantidadEntre50y150 + " artículos que costaron entre $50 y $150");
    System.out.println("Hay " + cantidadMas150 + " artículos que costaron más de $150");

  }
}
