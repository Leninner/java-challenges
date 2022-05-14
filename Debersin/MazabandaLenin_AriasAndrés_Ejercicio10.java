package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio10 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra si un año es bisiesto o no
     * @return {String} El mensaje con el resultado final de la función
     */
    Scanner scan = new Scanner(System.in);
    System.out.println("**** Bienvenido a la función que calcula si un año es bisiesto o no ****");
    System.out.println("Ingresa el año");
    System.out.print("-> ");

    int year = scan.nextInt();
    scan.close();

    System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "El año " + year + " es bisiesto\n"
        : "El año " + year + " no es bisiesto\n");

  }
}
