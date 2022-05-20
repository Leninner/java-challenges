package RepetitionStructure;

public class MazabandaLenin_AriasAndrés_Ejercicio06 {
  /**
   * Que imprima la suma de todos los números impares que van del 1 al 100 y diga
   * cuántos hay.
   */

  public static void main(String[] args) {
    int totalSum = 0;
    int oddNumberCounter = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        totalSum += i;
        oddNumberCounter++;
      }
    }

    System.out.println(totalSum);
    System.out.println(oddNumberCounter);
  }

}
