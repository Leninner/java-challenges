package Debersin;

public class MazabandaLenin_AriasAndrés_Ejercicio05 {
  public static void main(String[] args) {
    /**
     * @description: Función que muestra el resultado de una historia
     * @return {String} El mensaje que con el resultado final de la historia.
     */

    int juan = 3, maria = 5, adan = 6, totalManzanas = juan + maria + adan, auxJuan = juan, auxMaria = maria,
        auxAdan = adan;

    System.out.println("**** Bienvenido a la historia de una mujer ****");
    System.out.println("Juan tiene " + juan + " manzanas\n" + "Maria tiene " + maria + " manzanas\n" + "Adan tiene "
        + adan + " manzanas\n");
    System.out.println("Total de manzanas: " + totalManzanas + "\n");

    System.out.println(
        "Si se desea que cada persona tenga el mismo número de manzanas, se debe restar 2 manzanas al total y dividirlas entre las 3 personas");
    System.out
        .println("-> Total de manzanas que tendrá cada uno: " + (totalManzanas - 2) / 3 + "\nSobrante de manzanas: "
            + totalManzanas % 3 + "\n");

    for (int i = 1; i <= 7; i++) {
      juan--;
      maria--;
      adan--;

      if (i < 6) {
        juan += auxJuan;
        maria += auxMaria;
        adan += auxAdan;
      }

      if (i == 7) {
        juan--;
        maria--;
        adan--;
      }
    }

    System.out.println(
        "El número de manzanas que tiene cada uno después de una semana en el caso  planteado es: \nJuan: " + juan
            + "\nMaria: " + maria
            + "\nAdan: " + adan
            + "\n");

    System.out.println("El total de manzanas reunidas entre los 3 estudiantes es: " + (juan + maria + adan));

  }
}
