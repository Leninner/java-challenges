package RepetitionStructure;

public class MazabandaLenin_AriasAndrés_Ejercicio17 {
  public static void main(String[] args) {
    // Que escriba los primeros 25 dígitos de la sucesión de Fibonacci.

    int a = 0;
    int b = 1;
    int c = 0;

    for (int i = 0; i < 25; i++) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
    }
  }
}
