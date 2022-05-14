package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio07 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra si una persona ganó un premio o no
     * @return {String} El mensaje que con el resultado final del sorteo
     */

    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido al lugar donde los sueños se hacen realidad ****");
    System.out.println("Ingresa el número para probar suerte");
    System.out.print("-> ");

    int number = scan.nextInt();
    scan.close();

    System.out.println(number % 2 == 0 && (number >= 1 && number <= 1000) ? "Felicidades, has ganado un premio\n"
        : "Lo sentimos, no has ganado un premio\n");

  }
}
