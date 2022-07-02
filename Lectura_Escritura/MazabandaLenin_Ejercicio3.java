package Lectura_Escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Desarrolle un programa que solicite 10 palabras ingresadas por teclado y las
 * almacene en un archivo. El programa intercambiará las vocales a por @; e por 3, o
 * por 0 (cero).
 */

public class MazabandaLenin_Ejercicio3 {
    static Scanner scan = new Scanner(System.in);
    static String word;

    public static void main(String[] args) {
        System.out.print("Ingresa el nombre del archivo: ");
        String nameFile = scan.next();

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
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }

        return file;
    }

    public static String getWord(int position) {
        do {
            try {
                System.out.print("Ingrese la palabra " + (position + 1) + ": ");
                word = scan.next();

                if(!word.matches("\\d+")) {
                    return word;
                } else {
                    System.out.println("\nEl nombre debe contener solo letras\n");
                }
            } catch (Exception e) {
                System.out.println("Error al ingresar el nombre");
            }
        } while(word.matches("\\d*"));

        return word;
    }

    public static String changeVowels(String word) {
        // a -> @
        // e -> 3
        // o -> 0
        String newWord = word.replaceAll("[aAáÁ]", "@");
        newWord = newWord.replaceAll("[eEéÉ]", "3");
        newWord = newWord.replaceAll("[oOóÓ]", "0");

        return newWord;
    }

    public static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        int i = 0;

        do {
            pw.println(changeVowels(getWord(i).trim()) + " ");
            i++;
        } while (i < 10);

        pw.close();
        fw.close();
    }
}
