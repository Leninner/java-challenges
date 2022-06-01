package src;

import javax.swing.JOptionPane;

public class MultipleOfTen {
  public static void main(String[] args) {
    float number = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero"));

    if (number % 10 == 0) {
      JOptionPane.showMessageDialog(null, "El número " + number + " es múltiplo de 10");

    } else {
      JOptionPane.showMessageDialog(null, "El número " + number + " no es múltiplo de 10");
    }
  }
}