package Anita;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double descuento = 0;
    double costo = 0;
    double acumuladorCosto = 0;
    double acumuladorDescuento = 0;
    double costoTotal = 0;
    double acumuladorCostoTotal = 0;
    int seccion = 0;
    int contadorProductos = 0;

    do {
      System.out.println("\nIngresa la sección del producto");
      System.out.println("1. Lácteos");
      System.out.println("2. Juguetes");
      System.out.println("3. Embutidos");
      System.out.println("4. Ninguna");
      seccion = scan.nextInt();

      if (seccion == 4) {
        break;
      }

      if (seccion == 1) {

      } else if (seccion == 2) {
        System.out.println("Ingresa el costo del producto");
        costo = scan.nextDouble();
        descuento = costo * 0.08;
        costoTotal = costo - descuento;
        contadorProductos++;
      } else if (seccion == 3) {

      }

      switch (seccion) {
        case 1:
          System.out.println("Ingresa el costo del producto");
          costo = scan.nextDouble();
          descuento = costo * 0.12;
          costoTotal = costo - descuento;
          contadorProductos++;

          break;

        case 2:
          System.out.println("Ingresa el costo del producto");
          costo = scan.nextDouble();
          descuento = costo * 0.08;
          costoTotal = costo - descuento;
          contadorProductos++;

          break;

        case 3:
          System.out.println("Ingresa el costo del producto");
          costo = scan.nextDouble();
          descuento = costo * 0.03;
          costoTotal = costo - descuento;
          contadorProductos++;

          break;

        default:
          System.out.println("No seleccionaste ninguna sección");
          break;
      }

      acumuladorCosto += costo;
      acumuladorDescuento += descuento;
      acumuladorCostoTotal += costoTotal;
    } while (seccion != 4);

    scan.close();

    System.out.println("El total de productos ingresados es: " + contadorProductos);
    System.out.println("El subtotal de la compra es: " + acumuladorCosto);
    System.out.println("El valor del descuento es: " + acumuladorDescuento);
    System.out.println("El total de la compra es: " + acumuladorCostoTotal);

  }
}