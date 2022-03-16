import javax.swing.JOptionPane;

public class DecimalToBinary {
  public static void main(String[] args) {
    int decimalNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to convert to binary"));
    String binaryNumberInverted = "";
    int quotient = decimalNumber;

    while (quotient != 1) {
      binaryNumberInverted += quotient % 2;
      quotient /= 2;
    }

    binaryNumberInverted += quotient;
    StringBuilder builder = new StringBuilder(binaryNumberInverted);

    String binaryNumber = builder.reverse().toString();
    JOptionPane.showMessageDialog(null, "The binary number is " + binaryNumber);
  }
}
