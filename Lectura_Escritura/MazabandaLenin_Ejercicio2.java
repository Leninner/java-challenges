package Lectura_Escritura;

import java.io.*;
import java.util.Scanner;

/**
 * Desarrolle un programa que solicite 10 palabras ingresadas por teclado y las
 * almacene en un archivo. El programa debe cambiar las vocales que contenga cada
 * palabra ingresada por un guion bajo
 */

public class MazabandaLenin_Ejercicio2 {
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

    public static String wordWithinVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(String.valueOf(word.charAt(i)).matches("[aeiouAEIOUÁÉÍÓÚáéíóú]")) {
                word = word.substring(0, i) + "_" + word.substring(i + 1);
            }
        }

        return word;
    }

    public static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        int i = 0;

        do {
            pw.println(wordWithinVowels(getWord(i).trim()) + " ");
            i++;
        } while (i < 10);

        pw.close();
        fw.close();
    }
}
