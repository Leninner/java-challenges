package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio08 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra el valor absoluto de un número
     * @return {String} El mensaje con el valor absoluto del número
     */

    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la función que calcula el valor absoluto de un número ****");
    System.out.println("Ingresa el número");
    System.out.print("-> ");

    int number = scan.nextInt();
    scan.close();

    System.out.println(number < 0 ? "El valor absoluto es: " + Math.abs(number) + "\n"
        : "El valor absoluto es: " + number + "\n");

  }
}
