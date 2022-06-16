package src;

import javax.swing.JOptionPane;

public class Varios {
  private static String idRegex = "^[a-zA-Z0-9]{1,10}$";
  private static String nameRegex = "^[a-zA-Z\\s]{1,50}$";
  private static String emailRegex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";

  public static void main(String[] args) {
    String id = getInfo("id", idRegex);
    String name = getInfo("nombre", nameRegex);
    String email = getInfo("email", emailRegex);
    JOptionPane.showMessageDialog(null, "Id: " + id + "\nNombre: " + name + "\nEmail: " + email);
  }

  public static String getInfo(String param, String regex) {
    String input;

    do {
      input = JOptionPane.showInputDialog(null, "Ingrese " + param + ": ");

      if (input.matches(regex)) {
        return input;
      } else {
        JOptionPane.showMessageDialog(null, "Error: " + param + " no valido");
        continue;
      }

    } while (!input.matches(regex));

    return "";
  }
}