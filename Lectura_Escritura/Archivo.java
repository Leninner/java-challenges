package Lectura_Escritura;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
  /**
   * Method to read files
   * 
   * @param File
   * @return true-false Depending the state of the reading
   */
  public static boolean readFile(File fileToRead) throws FileNotFoundException, IOException {
    FileReader fr = new FileReader(fileToRead);
    BufferedReader br = new BufferedReader(fr);
    String linea;

    while ((linea = br.readLine()) != null) {
      System.out.println(linea);
    }

    br.close();
    fr.close();

    return false;
  }

  /**
   * Method to read files from the end
   * 
   * @param File
   * @return true-false Depending the state of the reading
   */
  public static boolean readFileFromEnd(File fileToRead) throws FileNotFoundException, IOException {
    FileReader fr = new FileReader(fileToRead);
    BufferedReader br = new BufferedReader(fr);
    int caracter;

    ArrayList<Character> temporalLines = new ArrayList<>();

    while ((caracter = br.read()) != -1) {
      temporalLines.add((char) caracter);
    }

    for (int i = temporalLines.size() - 1; i >= 0; i--) {
      System.out.print(temporalLines.get(i));
    }

    br.close();
    fr.close();

    return false;
  }

  /**
   * 
   * @param fileToWrite
   * @param phraseToWrite The phrase to add into the file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public static void writeFile(File fileToWrite, String phraseToWrite) throws FileNotFoundException, IOException {
    FileWriter fw = new FileWriter(fileToWrite);
    PrintWriter pw = new PrintWriter(fileToWrite);

    pw.println(phraseToWrite);

    pw.close();
    fw.close();
  }

  /**
   * This method writes a file at the end
   * 
   * @param fileToWrite
   * @param phraseToWrite The phrase to add into the file
   * @throws FileNotFoundException
   * @throws IOException
   */
  public static void writeFileAtTheEnd(File fileToWrite, String phraseToWrite)
      throws FileNotFoundException, IOException {
    FileWriter fw = new FileWriter(fileToWrite, true);
    PrintWriter pw = new PrintWriter(fw);

    pw.println(phraseToWrite);

    pw.close();
    fw.close();
  }

  public static void main(String[] args) {
    File fileToRead = new File("D:\\Dev\\Java\\java-challenges\\README.md");

    try {
      writeFile(fileToRead, "Esto es algo genial");
      writeFileAtTheEnd(fileToRead, "Esto se va a escribir al final del documento");
      writeFileAtTheEnd(fileToRead, "Esto se va a escribir al final del documento con S");
      readFile(fileToRead);

      System.out.println("\nAhora al revés\n");

      readFileFromEnd(fileToRead);
    } catch (FileNotFoundException e) {
      System.out.println("No se pudo encontrar el archivo");
    } catch (IOException e) {
      System.out.println("No se pudo leer el archivo correctamente");
    }
  }
}
