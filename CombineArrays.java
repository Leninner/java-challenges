import java.util.Scanner;

public class CombineArrays {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int[] firstGroup = new int[10];
      int[] secondGroup = new int[10];
      int[] resultGroup = new int[20];

      for (int i = 0; i < 10; i++) {
        System.out.print("Ingresa el numero " + (i + 1) + " del primer grupo: ");
        firstGroup[i] = scan.nextInt();

        System.out.print("Ingresa el numero " + (i + 1) + " del segundo grupo: ");
        secondGroup[i] = scan.nextInt();
      }
      int z = 0;

      for (int i = 0; i < 10; i++) {
        resultGroup[z] = firstGroup[i];
        resultGroup[z + 1] = secondGroup[i];
        z += 2;
      }

      for (int i = 0; i < 20; i++) {
        System.out.print(resultGroup[i] + " ");
      }

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}
