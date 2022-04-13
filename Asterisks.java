import javax.swing.JOptionPane;

public class Asterisks {
  public static void main(String[] args) {
    int width = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ancho de tu cuadro"));
    int height = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de tu cuadro"));

    System.out.println("Cuadrado relleno");

    System.out.println("");

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(" *");
      }

      System.out.println("");
    }

    System.out.println("");

    System.out.println("Cuadrado sin relleno");

    System.out.println("");

    for (int i = 0; i < width; i++) {
      System.out.print(" *");
    }

    System.out.println("");

    for (int i = 0; i < height - 2; i++) {
      System.out.print(" *");

      for (int j = 0; j < width - 2; j++) {
        System.out.print("  ");
      }

      System.out.println(" *");
    }

    for (int i = 0; i < width; i++) {
      System.out.print(" *");
    }

    System.out.println("");

    System.out.println("Pirámide");

    System.out.println("");

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(" *");
      }

      System.out.println("");
    }

    System.out.println("Método para imprimir un un hexágono");

    System.out.println("");

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (i == 0 || i == height - 1) {
          System.out.print(" *");
        } else {
          if (j == 0 || j == width - 1) {
            System.out.print(" *");
          } else {
            System.out.print("  ");
          }
        }
      }

      System.out.println("");
    }
  }
}
