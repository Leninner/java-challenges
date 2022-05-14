package Debersin;

import java.util.Scanner;

public class MazabandaLenin_AriasAndrés_Ejercicio04 {
  public static void main(String[] args) {
    /**
     * @description: Función que expresa en horas, minutos y segundos un tiempo
     *               expresado en
     *               segundos.
     * @return {String} El mensaje que con el tiempo expresado en horas, minutos y
     *         segundos
     */
    Scanner scan = new Scanner(System.in);

    System.out.println("**** Bienvenido a la función que calcula las horas, minutos y segundos ****");
    System.out.println("Ingresa la cantidad de segundos");
    System.out.print("-> ");

    float seconds = scan.nextFloat();
    scan.close();

    int hours = (int) seconds / 3600;
    int minutes = (int) (seconds % 3600) / 60;
    int secondsLeft = (int) (seconds % 3600) % 60;

    System.out.println("La cantidad de horas es: " + hours + "\n" + "La cantidad de minutos es: " + minutes + "\n"
        + "La cantidad de segundos es: " + secondsLeft + "\n");

  }

}
