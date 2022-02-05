import java.util.Scanner;

public class StrangeOrder {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      int[] numbers = new int[10];
      int z = 9;

      for (int i = 0; i < 10; i++) {
        System.out.print("Ingresa el numero " + (i + 1) + ": ");
        numbers[i] = scan.nextInt();
      }

      // First solution
      for (int i = 0; i < 10; i++) {
        System.out.print(numbers[i] + " ");
        System.out.print(numbers[i + z] + " ");
        z -= 2;
      }

      System.out.println();
      System.out.println();

      // Second solution
      for (int i = 0; i < 5; i++) {
        System.out.print(numbers[i] + " ");
        System.out.print(numbers[numbers.length - i - 1] + " ");
      }

    }
  }
}
