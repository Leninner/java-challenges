package src;

import java.util.ArrayList;
import javax.swing.JOptionPane;

// Source: https://www.youtube.com/watch?v=pM8684UA6BM

public class DinamicArray {

  private static void listaNormal() {
    int numElementos = Integer
        .parseInt(JOptionPane.showInputDialog("Humano, cuántos elementos vas a ingresar a tu arreglo?"));

    String[] names = new String[numElementos];

    for (int i = 0; i < names.length; i++) {
      names[i] = JOptionPane.showInputDialog("Humano, ingresa el elemento " + (i + 1) + ":");
    }
    System.out.println("Resultados de la lista normal");

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }

  private static void listaDinamica() {
    ArrayList<String> names = new ArrayList<>();
    char opcion;

    do {
      names.add(JOptionPane.showInputDialog("Humano, ingresa el elemento " + (names.size() + 1) + ":"));
      opcion = JOptionPane.showInputDialog("Humano, quiéres meter más elementos? S[si]/N[No]").charAt(0);
    } while (opcion == 'S' || opcion == 's');

    System.out.println("Resultados de la lista dinámica");

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    // 10,5,6, 10 ,7,9,10 => numeritos
    // numeritos.indexOf(10) => 0
    // numeritos.lastIndexOf(10) => 6
  }

  public static void main(String[] args) {
    listaNormal();
    listaDinamica();
  }

}
