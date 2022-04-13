public class EulerNumber {
  public static void main(String[] args) {
    int fact = 1;
    double currentEuler = 1; // 1 / 0!
    double auxOne = 0, auxTwo = 0;
    double auxFact = 1;

    do {
      // Vamos acumulando la suma de los factoriales en currentEuler
      currentEuler += 1 / auxFact;
      System.out.printf("%.5f\n", currentEuler);

      // Almacenamos el factorial anterior para calcular la diferencia del bucle
      auxOne = 1 / auxFact;
      auxFact = 1;
      fact++;

      // Actualizamos el valor del factorial auxiliar
      for (int i = 1; i <= fact; i++) {
        auxFact *= i;
      }

      // Almecenamos el factorial actual para calcular la diferencia del bucle
      auxTwo = 1 / auxFact;
    } while (auxOne - auxTwo > 0.0001);
  }
}
