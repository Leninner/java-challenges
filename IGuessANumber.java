import javax.swing.JOptionPane;

public class IGuessANumber {
  public static void main(String[] args) {
    int aleatoryNumber = (int) (Math.random() * 100);
    int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
    int intentos = 0;

    while(aleatoryNumber != userNumber){
      intentos++;

      if(userNumber < aleatoryNumber){
        userNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número mayor"));
      } else {
        userNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número menor"));
      }
    }

    JOptionPane.showMessageDialog(null, "Muy bien, haz adivinado el número " + aleatoryNumber + ". En " + intentos + " intentos");
  }

}
