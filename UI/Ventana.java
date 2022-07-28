package UI;

import javax.swing.*;
import java.awt.Color;

public class Ventana extends JFrame {
  public Ventana() {
    this.setTitle("Ventana de Leninsin"); // Titulo de la ventana
    setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando se cierra la ventana, se cierra el programa
    setVisible(true); // Hacemos visible la ventana
    this.setSize(500, 500); // tamaño de la ventana
    // setBounds(100, 100, 500, 500); // Ubicacion y tamaño de la ventana
    // setLocation(100, 100); // Ubicacion de la ventana
    setLocationRelativeTo(null); // Ubicacion de la ventana en el centro de la pantalla
    // setBackground(Color.CYAN); // Color de fondo de la ventana

    initComponents(); // Inicializamos los componentes de la ventana
  }

  private void initComponents() {
    JPanel panel = new JPanel(); // Creamos un panel
    panel.setBackground(Color.BLUE); // Color de fondo del panel

    this.getContentPane().add(panel); // Agregamos el panel al contenedor de la ventana
  }
}
