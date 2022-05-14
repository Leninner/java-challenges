package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio09 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra si existe coincidencia en la primera letra
     *               o en la última letra de dos nombres
     * @return {String} El mensaje con el resultado final de la función
     */

    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la función que calcula la coincidencia entre 2 nombres ****");

    System.out.println("Ingresa el primer nombre");
    System.out.print("-> ");
    String firstPerson = scan.next();

    System.out.println("Ingresa el segundo nombre");
    System.out.print("-> ");
    String secondPerson = scan.next();

    scan.close();

    if (firstPerson.charAt(0) == secondPerson.charAt(0) || firstPerson.charAt(firstPerson.length() - 1) == secondPerson
        .charAt(secondPerson.length() - 1)) {
      System.out.println("Coinciencia: " + firstPerson + " y " + secondPerson + "\n");
    } else {
      System.out.println("No hay coincidencia\n");
    }
  }
}
