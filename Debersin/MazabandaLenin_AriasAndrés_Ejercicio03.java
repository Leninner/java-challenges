package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio03 {
  /**
   * @description: Función que pide al usuario el radio de una esfera y muestra
   *               por pantalla
   *               el
   *               volumen de la esfera
   * @return {String} El mensaje que con el volumen de la esfera.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la función que calcula el volumen de una bola ****");
    System.out.println("Ingresa el radio de la esfera");
    System.out.print("-> ");

    float sphereRadius = scan.nextFloat();
    scan.close();

    System.out.println(
        "El volumen es: " + Math.round(((4 * Math.PI * Math.pow(sphereRadius, 3)) / 3) * 100.0) / 100.0 + "\n");
  }

}
