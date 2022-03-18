import javax.swing.JOptionPane;

public class TablaDeMultiplicar {
  public static void main(String[] args) {
    int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("La tabla de multiplicar de qué número deseas?"));
    int tableLength = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de posiciones de tu tabla"));

    System.out.println("Tu tabla de multiplicar del número " + tableNumber + " es:");
    System.out.println("");

    for (int i = 1; i <= tableLength; i++) {
      System.out.println("| " + tableNumber + " x " + i + " | " + tableNumber * i + " |");
    }
  }
}