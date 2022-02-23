import java.util.Scanner;
// Pedir al usuario un arreglo y pedir número por número. Ordenar los números de menor a mayor
// Pedir al usuario qué número quiere buscar y darle la posición del número

public class BubbleSort {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Oye, dime la cantidad de elementos para tu arreglo");
    int n = scan.nextInt();
    int[] numbers = new int[n];
    int aux = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digita el número " + (i + 1) + ": ");
      numbers[i] = scan.nextInt();
    }

    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          aux = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = aux;
        }
      }
    }

    System.out.println("¿Qué número quiéres buscar?");
    int busqueda = scan.nextInt();
    scan.close();
    Boolean isFind = true;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == busqueda) {
        System.out.println("Encontré tu número " + busqueda + " en la posición " + i);
        break;
      }

      if (i == numbers.length - 1) {
        isFind = false;
      }
    }

    if (!isFind) {
      System.out.println("No pude encontrar tu número");
    }
  }
}