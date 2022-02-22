// Comprobar si dos arrays son iguales

public class EqualArrays {
  public static void main(String[] args) {
    int[] arrayA = { 1, 2, 3, 4, 5, 6 };
    int[] arrayB = { 1, 2, 3, 4, 5, 6 };

    if (arrayA.length != arrayB.length) {
      System.out.println("No son iguales");
    }

    for (int i = 0; i < arrayB.length; i++) {
      if (arrayA[i] != arrayB[i]) {
        break;
      }
    }
  }
}
