import javax.swing.JOptionPane;

public class numbersInOrden {
  public static void main(String[] args) {
    int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
    int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
    int numberThree = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero: "));

    if(numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree){
      System.out.println(numberOne + " " + numberTwo + " " + numberThree);
    } else if(numberTwo>numberOne && numberTwo > numberThree && numberOne>numberThree) {
      System.out.println(numberTwo + " " + numberOne + " " + numberThree);
    } else if(numberThree > numberOne && numberThree > numberTwo && numberOne > numberTwo) {
      System.out.println(numberThree + " " + numberOne + " " + numberTwo);
    }
  }
}
