import javax.swing.JOptionPane;

public class DigitsOfANumber {
  public static void main(String[] args) {
    int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number in a 0 to 99999 range: "));
    int quantityOfDigits = 0;
    int z = number;

    if(number  > 99999 || number < 0){
      JOptionPane.showMessageDialog(null, "The number is out of range");
    } else {
      while(number != 0){
        number /= 10;
        quantityOfDigits++;
      }
  
      JOptionPane.showMessageDialog(null, "The number " + z + " you entered has " + quantityOfDigits + " digits");
    }
  }
}

// Scanner y JOptionPane no se llevan bien