package Lectura_Escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Desarrolle un programa que solicite el nombre, la nota del primer parcial y la nota
 * del segundo parcial. La nota final de cada alumno será el promedio de las dos notas
 * solicitadas previamente (primer y segundo parcial). La cantidad de alumnos a
 * ingresar se ingresará por teclado. Almacenar en un archivo la información de todos
 * los alumnos ingresados por teclado, en donde la información de cada alumno estará
 * en una línea separada por un punto y coma “;”.
 */

public class MazabandaLenin_Ejercicio5 {
    static Scanner scan = new Scanner(System.in);
    static String studentName;
    static float firstPartialNote;
    static float secondPartialNote;

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

    public static String getFilledStudentData(int position) {
        scan.nextLine();

        System.out.print("Ingresa el nombre del estudiante " + (position + 1) + ": ");
        studentName = scan.nextLine();

        System.out.print("Ingresa la nota del primer parcial de " + studentName + ": ");
        firstPartialNote = scan.nextFloat();

        System.out.print("Ingresa la nota del segundo parcial de " + studentName + ":");
        secondPartialNote = scan.nextFloat();

        return studentName + ";" + String.valueOf(firstPartialNote) + ";" + String.valueOf(secondPartialNote)
                + ";" + String.valueOf((firstPartialNote + secondPartialNote) / 2);
    }

    public static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        System.out.print("Ingresa la cantidad de estudiantes: ");
        int students = scan.nextInt();
        int i = 0;

        do {
            pw.println(getFilledStudentData(i));
            i++;
        } while (i < students);

        pw.close();
        fw.close();
    }
}
