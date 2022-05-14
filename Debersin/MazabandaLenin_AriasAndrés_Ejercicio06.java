package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio06 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra el promedio de las 3 notas de un estudiante
     *               y comprueba si aprobó o no
     * @return {String} El mensaje que con el promedio de las 3 notas y si aprobó o
     *         no
     */
    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la función que calcula el promedio de un estudiante ****");

    float promedio = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Ingresa la nota " + (i + 1) + " de la materia");
      System.out.print("-> ");

      promedio += scan.nextFloat();
    }

    scan.close();

    System.out.println(Math.round((promedio / 3) * 100.0) / 100.0 > 7
        ? "Felicidades, has aprobado la materia con " + Math.round((promedio / 3) * 100.0) / 100.0 + " puntos\n"
        : "Lo sentimos, has reprobado la materia con " + Math.round((promedio / 3) * 100.0) / 100.0 + " puntos\n");
  }

}
