package Lectura_Escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Prueba {
  public static void main(String[] args) {
    File file = new File("D:\\Dev\\escritura.txt");
    Writer writer = null;
    Scanner scan = new Scanner(System.in);

    try {
      file.createNewFile();
      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
      while (scan.hasNextLine()) {
        writer.write(scan.nextLine());
        writer.write("\n");
      }

      scan.close();
    } catch (IOException e) {
      System.out.println("Error al crear el archivo");
    } finally {
      try {
        writer.close();
      } catch (IOException ex3) {
        System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
      }
    }
  }
}