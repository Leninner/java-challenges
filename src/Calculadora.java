package src;

import javax.swing.JOptionPane;

public class Calculadora {
  public static void main(String[] args) {
    char operador = JOptionPane.showInputDialog("¿Qué tipo de operación hacemos hoy?").charAt(0);

    operador = Character.toUpperCase(operador);

    float valueOne = Float.parseFloat(JOptionPane.showInputDialog("Digite o primer valor: "));
    float valueTwo = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));

    switch (operador) {
      case 'S':
        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + (valueOne + valueTwo));
        break;
      case 'R':
        JOptionPane.showMessageDialog(null, "Resultado de la resta: " + (valueOne - valueTwo));
        break;
      case 'M':
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + (valueOne * valueTwo));
        break;
      case 'D':
        if (valueTwo == 0) {
          JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
        } else {
          JOptionPane.showMessageDialog(null, "El resultado de la división es: " + (valueOne / valueTwo));
        }
        break;

      default:
        JOptionPane.showMessageDialog(null, "Operador no válido, pórtate vivo");
        break;
    }
  }
}
