package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio01 {
  public static void main(String[] args) {
    /**
     * @description: Función que permite ingresar a un comerciante el costo de
     *               compra de un
     *               artículo y que determina el precio al cual debe venderlo si
     *               desea ganar el 15%.
     * @return {String} El mensaje que con el precio final del producto.
     */
    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido Triple 7, esta es tu tienda de comercio electrónico ****");
    System.out.println(
        "Para empezar, ingresa el precio de tu producto y yo te diré cuánto debe ser tu precio final si quiéres ganar el 15%");
    System.out.print("-> ");

    float precio = scan.nextFloat();
    scan.close();

    System.out.println("El precio final de tu producto es: " + Math.round((precio * 1.15) * 100.0) / 100.0 + "\n");

  }

}
