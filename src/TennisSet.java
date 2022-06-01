package src;

import javax.swing.JOptionPane;

public class TennisSet {
  public static void main(String[] args) {
    int playerA = Integer
        .parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de juegos ganados por el jugador A"));
    int playerB = Integer
        .parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de juegos ganados por el jugador B"));

    if (playerA > 7 || playerB > 7) {
      JOptionPane.showMessageDialog(null, "Tienes un puntaje inválido");
    } else if (playerA > playerB && (playerA == 6 || playerA == 7)) {
      JOptionPane.showMessageDialog(null, "El ganador es el jugador A");
    } else if (playerB > playerA && (playerB == 6 || playerB == 7)) {
      JOptionPane.showMessageDialog(null, "El ganador es el jugador B");
    } else if (playerA == playerB) {
      if (playerA == 6 || playerA == 5) {
        JOptionPane.showMessageDialog(null, "Están en el juego decisivo");
      } else {
        JOptionPane.showMessageDialog(null, "Están empatando y el juego aún no termina");
      }
    }
  }
}
