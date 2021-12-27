import javax.swing.JOptionPane;

public class isUpperCase {
  public static void main(String[] args) {
    String letter = JOptionPane.showInputDialog("Digita una letra");

    int letterCode = letter.charAt(0);
    
    if(letterCode < 97 && (letterCode >= 65 && letterCode <= 90)) {
      JOptionPane.showMessageDialog(null, "La letra " + letter + " es mayúscula");
    } else {
      JOptionPane.showMessageDialog(null, "La letra " + letter + " es minúsucula o es algún otro caractér");
    }
  }
}
