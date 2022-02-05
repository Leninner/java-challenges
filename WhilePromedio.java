import javax.swing.JOptionPane;

public class WhilePromedio {
  public static void main(String[] args) {
    float sumGrades = 0, cont = 0;

    float gradeUser = Float.parseFloat(JOptionPane.showInputDialog("Ingresa una nota"));

    while (gradeUser > 0) {
      cont++;
      sumGrades += gradeUser;
      gradeUser = Float.parseFloat(JOptionPane.showInputDialog("Ingresa otra nota"));
    }

    if (cont == 0) {
      JOptionPane.showMessageDialog(null, "Debes ingresar notas bobo");
    } else {
      JOptionPane.showMessageDialog(null, "La media de las notas ingresadas es: " + (sumGrades / cont));
    }
  }
}
