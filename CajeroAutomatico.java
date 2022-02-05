import javax.swing.JOptionPane;

public class CajeroAutomatico {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Welcome to the Cajero Automatico");
    String nameClient = JOptionPane.showInputDialog("Ingresa tu nombre");
    final int MAX_AMOUNT = 1000;

    int typeAction = Integer.parseInt(JOptionPane
        .showInputDialog("¿Qué tipo de operación deseas realizar? (Retiro(1), Depósito(2) o Consultar saldo(3))"));

    switch (typeAction) {
      case 1:
        JOptionPane.showMessageDialog(null, "Retiro");
        float money = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero quiéres retirar?"));

        if (money > MAX_AMOUNT) {
          JOptionPane.showMessageDialog(null, "No tienes esa cantidad de dinero " + nameClient);
        } else {
          JOptionPane.showMessageDialog(null,
              "Retiro exitoso " + nameClient + ", tu saldo actual es de: " + (MAX_AMOUNT - money));
        }
        break;

      case 2:
        JOptionPane.showMessageDialog(null, "Depósito");
        float moneyDeposit = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto dinero quieres depositar?"));

        JOptionPane.showMessageDialog(null,
            "Depósito exitoso " + nameClient + ", tu saldo actual es de: " + (MAX_AMOUNT + moneyDeposit));
        break;

      case 3:
        JOptionPane.showMessageDialog(null, "Consultar saldo");
        JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " + MAX_AMOUNT);
        break;

      default:
        JOptionPane.showMessageDialog(null, "Operación no válida, pórtate vivo");
        break;
    }
  }
}
