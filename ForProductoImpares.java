import javax.swing.JOptionPane;

public class ForProductoImpares {
  public static void main(String[] args) {
    long sumOddNumbers = 1;

    for (int i = 1; i <= 20; i += 2) {
      sumOddNumbers *= i;
    }

    JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números impares es: " + sumOddNumbers);
  }
}
