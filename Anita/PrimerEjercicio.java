package Anita;

public class PrimerEjercicio {
  public static void main(String[] args) {
    double suma = 0;

    for (int i = 1; i <= 20; i++) {
      suma += i;

      if (i == 20) {
        System.out.print(i + " = ");
      } else {
        System.out.print(i + " + ");
      }
    }

    System.out.println("\n\nLa suma de los 20 primeros números es: " + suma);
    System.out.println("El promedio de los 20 primeros números es: " + suma / 20);
  }
}
