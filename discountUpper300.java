import javax.swing.JOptionPane;

public class discountUpper300 {
  public static void main(String[] args) {
    double compra = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de compra"));

    if(compra > 300){
      JOptionPane.showMessageDialog(null, "El valor total a pagar es: " + Math.floor((compra * 0.02f) - compra) ); 
    } else {
      JOptionPane.showMessageDialog(null, "El valor total a pagar es: " + compra);
    }
  }
}