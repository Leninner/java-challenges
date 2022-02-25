import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OddOrEven {
  public static void main(String[] args) {
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    ArrayList<Integer> evenNumbers = new ArrayList<>();

    int ingreso;

    for (int i = 0; i < 10; i++) {
      ingreso = Integer.parseInt(JOptionPane.showInputDialog("Humano, ingresa el elemento " + (i + 1) + ":"));

      if (ingreso % 2 == 0) {
        evenNumbers.add(ingreso);
      } else {
        oddNumbers.add(ingreso);
      }
    }

    System.out.println("Resultados de la lista de números pares");

    for (int i = 0; i < evenNumbers.size(); i++) {
      System.out.println(evenNumbers.get(i));
    }

    System.out.println("Resultados de la lista de números impares");

    for (int i = 0; i < oddNumbers.size(); i++) {
      System.out.println(oddNumbers.get(i));
    }
  }
}
