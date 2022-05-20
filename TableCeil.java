public class TableCeil {
  /**
   * Imprimir los números del 1 al 100 en una tabla de 10 x 10
   * 
   */

  public static void main(String[] args) {
    int i = 1;

    while (i <= 100) {
      System.out.println("\t--------------------------------------------------------------------------------");
      System.out.print("-> ");

      for (int j = 0; j < 10; j++) {
        System.out.print("\t" + i + "");
        i++;
      }

      System.out.println("");
    }

  }
}
