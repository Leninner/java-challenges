package Anita;

public class NovenoEjercicio {
  public static void main(String[] args) {
    int contador = 0;

    for (int i = 10; i <= 50; i++) {
      if (i % 3 == 0) {
        contador++;
      }
    }

    System.out.println("\nExisten " + contador + " números múltiplos de 3 entre el 10 y el 50");
  }
}
