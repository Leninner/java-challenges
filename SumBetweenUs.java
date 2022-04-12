import javax.swing.JOptionPane;

public class SumBetweenUs {
  public static void main(String[] args) {
    int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
    int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
    int acumulativeSum = 0;

    if (firstNumber < secondNumber) {
      for (int i = firstNumber; i <= secondNumber; i++)
        acumulativeSum += i;
    } else {
      for (int i = secondNumber; i <= firstNumber; i++)
        acumulativeSum += i;
    }

    JOptionPane.showMessageDialog(null,
        "La suma de los números entre " + firstNumber + " y " + secondNumber + " es: " + acumulativeSum);
  }
}
