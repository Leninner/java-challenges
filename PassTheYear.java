import javax.swing.JOptionPane;

public class PassTheYear {
  public static void main(String[] args) {
    String nameStudent =  JOptionPane.showInputDialog("Ingresa el nombre del estudiante");

    float notaStudent = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota de " + nameStudent));

    if(notaStudent < 6) {
      JOptionPane.showMessageDialog(null, "Haz perdido el año " + nameStudent);
    } else if(notaStudent >= 6 && notaStudent < 8) {
      JOptionPane.showMessageDialog(null, "Haz aprobado el año " + nameStudent);
    } else if(notaStudent >= 8 && notaStudent < 10) {
      JOptionPane.showMessageDialog(null, "Haz aprobado con una nota muy buena " + nameStudent);
    } else if(notaStudent == 10) {
      JOptionPane.showMessageDialog(null, "Felicidades " + nameStudent + " has aprobado con una nota perfecta");
    }
  }
}
