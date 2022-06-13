package src;

public class Varios {
  public static void main(String[] args) {
    int number = 34;

    int unidad = number % 10;
    int decena = (number / 10) % 10;

    System.out.println("Unidad: " + unidad);
    System.out.println("Decena: " + decena);

  }
}