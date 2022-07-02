package Lectura_Escritura;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Desarrolle un programa que solicite 10 nombres de personas
 * ingresadas por
 * teclado
 * y almacene en un archivo. El programa debe transformar la
 * primera letra del
 * nombre
 * a mayúscula. Cada registro estará almacenado en una línea.
 */

public class MazabandaLenin_Ejercicio1 {
  static Scanner scan = new Scanner(System.in);
  static String nombre;

  public static void main(String[] args) {
    System.out.print("Ingresa el nombre del archivo: ");
    String nameFile = scan.nextLine();

    File file = createFile(nameFile);

    try {
      writeFile(file);
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo");
    }
  }

  public static File createFile(String nameFile) {
    final String PATH = "D:\\Dev\\";
    final String EXTENSION = ".txt";

    File file = new File(PATH + nameFile + EXTENSION);

    try {
      if (file.createNewFile()) {
        System.out.println("Archivo creado correctamente");
        return file;
      } else {
        System.out.println("El archivo ya existe");
      }
    } catch (Exception e) {
      System.out.println("Error al crear el archivo");
    }

    return null;
  }

  public static String getName(int position) {
    do {
      try {
        System.out.print("Ingrese el nombre " + position + ": ");
        nombre = scan.nextLine();

        if(!nombre.matches("\\d+")) {
          return nombre;
        } else {
          System.out.println("\nEl nombre debe contener solo letras\n");
        }
      } catch (Exception e) {
        System.out.println("Error al ingresar el nombre");
      }
    } while(nombre.matches("\\d*"));

    return nombre;
  }

  public static String wordToUpperCase(String word) {
    String[] words = word.split(" ");
    StringBuilder newWord = new StringBuilder();

    if(words.length > 1) {
      for (String s : words) {
        newWord.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
      }

      return newWord.toString();
    } else {
      return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
  }

  public static void writeFile(File file) throws IOException {
    FileWriter fw = new FileWriter(file, true);
    PrintWriter pw = new PrintWriter(fw);
    String nombre;
    int i = 0;

    do {
        nombre = getName(i).trim();
        pw.println(wordToUpperCase(nombre) + " ");
        i++;
    } while (i < 10);

    pw.close();
    fw.close();
  }
}
