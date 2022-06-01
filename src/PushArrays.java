package src;

public class PushArrays {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int[] b = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
    int[] c = new int[12 * 2];

    int i = 0;

    for (int j = 0; j < c.length; j += 6) {
      c[j] = a[i];
      c[j + 1] = a[i + 1];
      c[j + 2] = a[i + 2];
      c[j + 3] = b[i];
      c[j + 4] = b[i + 1];
      c[j + 5] = b[i + 2];
      i += 3;
    }

    for (int k = 0; k < c.length; k++) {
      System.out.println(c[k]);
    }
  }
}
