package src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Varios {
  static Scanner scan = new Scanner(System.in);

  public static File createFile() {
    System.out
        .print("Introduce el nombre del archivo y  su extensión. \nEl archivo será guardado en el directorio Dev: ");
    String name = scan.nextLine();
    File file = new File("D:\\Dev\\" + name);

    if (file.exists()) {
      System.out.println("Un archivo con ese nombre ya existe");
      return file;
    } else {
      try {
        file.createNewFile();
        System.out.println("Archivo creado con éxito");
        return file;
      } catch (IOException e) {
        return null;
      }

    }
  }

  public static void main(String ars[]) throws IOException {
    // Instancias para escribir en el archivo
    FileWriter fw = new FileWriter(createFile());
    BufferedWriter bw = new BufferedWriter(fw);

    System.out.println("Ingresa la información que quiéres escribir en el archivo");
    String contenido = scan.nextLine();

    for (int i = 0; i < contenido.length(); i++) {
      bw.write(contenido.charAt(i) + " ");
    }

    bw.close();
  }
}