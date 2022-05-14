package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio02 {
  public static void main(String[] args) {
    /**
     * @description: Función que lee el valor correspondiente a una distancia en
     *               millas
     *               marinas y las
     *               escriba expresadas en metros. Sabiendo que 1 milla marina
     *               equivale a 1852 metros.
     * @return {String} El mensaje que con la distancia en metros.
     */

    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la conversión de millas marinas a metros ****");
    System.out.println("Ingresa la distancia en millas maritimas");
    System.out.print("-> ");

    float maritimeMiles = scan.nextFloat();
    scan.close();

    System.out.println("La distancia en metros es: " + (maritimeMiles * 1852) + "\n");

  }

}
