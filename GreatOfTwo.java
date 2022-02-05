import javax.swing.JOptionPane;

public class GreatOfTwo {
  public static void main(String[] args) {
    int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero"));
    int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Digita otro número entero"));

    if (numberOne == numberTwo) {
      JOptionPane.showMessageDialog(null, "Los números son iguales");
    } else if (numberOne > numberTwo) {
      JOptionPane.showMessageDialog(null, "El número " + numberOne + " es mayor que el número " + numberTwo);
    } else {
      JOptionPane.showMessageDialog(null, "El número " + numberTwo + " es mayor que el número " + numberOne);
    }
  }
}
