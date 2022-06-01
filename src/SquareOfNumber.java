package src;

import javax.swing.JOptionPane;

public class SquareOfNumber {
  public static void main(String[] args) {
    double number = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));

    while (number > 0) {
      JOptionPane.showMessageDialog(null, "El cuadrado de tu número es: " + (Math.pow(number, 2)));
      number = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
    }
  }
}
