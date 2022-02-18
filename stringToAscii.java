import java.util.ArrayList;
import javax.swing.JOptionPane;

public class stringToAscii {
  public static void main(String[] args) {
    ArrayList<Integer> ascii = new ArrayList<Integer>();
    String cadena = JOptionPane.showInputDialog("Introduce una cadena");
    char caracter;
    int asciiCaracter;

    // HOLA

    for (int i = 0; i < cadena.length(); i++) {
      caracter = cadena.charAt(i);
      asciiCaracter = (int) caracter;
      ascii.add(asciiCaracter);
    }

    for (int i = 0; i < ascii.size(); i++) {
      caracter = (char) (int) ascii.get(i); // Integer, int, char
      System.out.println(caracter);
    }
  }

}
