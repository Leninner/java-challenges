package RepetitionStructure;

public class MazabandaLenin_AriasAndrés_Ejercicio04 {
  // Que imprima la suma de todos los números que van del 1 al 100.
  // Ejemplo: 1 + 2 + 3 + ... + 100 = 5050

  public static void main(String[] args) {
    int suma = 0;

    for (int i = 1; i <= 100; i++) {
      suma += i;
    }

    System.out.println(suma);
  }
}
