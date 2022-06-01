package src;

public class Strings {
  public static void main(String[] args) {
    String cadena = "Lenin | Matemáticas | Física | Química | Biología | Historia | Geografía | Artes | Ciencias | Ingles | Español | Francés | Italiano";

    String[] materias = cadena.split("\\|");

    for (int i = 0; i < materias.length; i++) {
      System.out.println(materias[i]);
    }
  }
}
