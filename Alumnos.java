import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alumnos {
  public static void main(String[] args) {
    float[][] notesPerStudent = new float[5][3];
    ArrayList<String> studentNames = new ArrayList<>();

    int i = 0;

    JOptionPane.showMessageDialog(null, "Bienvenido al programa de Alumnos de la UTA\n"
        + "Por favor ve ingresando los nombres de tus alumnos y sus calificaciones");

    while (i < 5) {
      studentNames.add(JOptionPane.showInputDialog("Ingrese el nombre del alumno"));

      notesPerStudent[i][0] = Float
          .parseFloat(JOptionPane.showInputDialog("Ingrese la nota del primer trimestre de " + studentNames.get(i)));

      notesPerStudent[i][1] = Float
          .parseFloat(JOptionPane.showInputDialog("Ingrese la nota del segundo trimestre de " + studentNames.get(i)));

      notesPerStudent[i][2] = Float
          .parseFloat(JOptionPane.showInputDialog("Ingrese la nota del tercer trimestre de " + studentNames.get(i)));
      i++;
    }

    while (true) {
      int option = Integer
          .parseInt(JOptionPane.showInputDialog("Ingresa la opción de tu estudiante para ver su promedio\n"
              + "1. " + studentNames.get(0) + "\n"
              + "2. " + studentNames.get(1) + "\n"
              + "3. " + studentNames.get(2) + "\n"
              + "4. " + studentNames.get(3) + "\n"
              + "5. " + studentNames.get(4) + "\n"
              + "6. Salir"));

      switch (option) {
        case 1:
          JOptionPane.showMessageDialog(null, "El promedio del alumno " + studentNames.get(0) + " es: "
              + (notesPerStudent[0][0] + notesPerStudent[0][1] + notesPerStudent[0][2]) / 3);
          break;
        case 2:
          JOptionPane.showMessageDialog(null, "El promedio del alumno " + studentNames.get(1) + " es: "
              + (notesPerStudent[1][0] + notesPerStudent[1][1] + notesPerStudent[1][2]) / 3);
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "El promedio del alumno " + studentNames.get(2) + " es: "
              + (notesPerStudent[2][0] + notesPerStudent[2][1] + notesPerStudent[2][2]) / 3);
          break;
        case 4:
          JOptionPane.showMessageDialog(null, "El promedio del alumno " + studentNames.get(3) + " es: "
              + (notesPerStudent[3][0] + notesPerStudent[3][1] + notesPerStudent[3][2]) / 3);
          break;
        case 5:
          JOptionPane.showMessageDialog(null, "El promedio del alumno " + studentNames.get(4) + " es: "
              + (notesPerStudent[4][0] + notesPerStudent[4][1] + notesPerStudent[4][2]) / 3);
          break;
        case 6:
          JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres salir?");
          System.exit(0);
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción inválida, intenta de nuevo");
          break;
      }
    }
  }
}
