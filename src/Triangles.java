package src;

import javax.swing.JOptionPane;

public class Triangles {
  public static void main(String[] args) {
    float a, b, c;
    a = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado A"));
    b = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado B"));
    c = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del lado C"));

    if (a + b < c || a + c < b || b + c < a) {
      JOptionPane.showMessageDialog(null, "Tu triángulo es  inválido");
    } else if (a == b && a == c) {
      JOptionPane.showMessageDialog(null, "Tienes un triángulo equilátero, de lados iguales");
    } else if (a == b && a != c || a == c && a != b || b == c && b != a) {
      JOptionPane.showMessageDialog(null, "Tienes un triángulo isósceles, de 2 lados iguales y un desigual");
    } else {
      JOptionPane.showMessageDialog(null, "Tienes un triángulo escaleno. Todos los lados desiguales");
    }
  }
}
