package Lectura_Escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Desarrolle un programa que genere 100 placas de vehículos y las guarde en un
 * archivo. Cada placa se almacenará en una línea; Para ello utilizar la generación de
 * letras y de números aleatorios. La placa tendrá el siguiente formato: “AAA-0000”. El
 * número que conforma la placa consta de 4 dígitos
 */

public class MazabandaLenin_Ejercicio4 {
    static Scanner scan = new Scanner(System.in);

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


    public static void writeFile(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        int i = 0;

        do {
            pw.println(generateVehicleLicensePlate());
            i++;
        } while (i < 100);

        pw.close();
        fw.close();
    }

    public static String generateVehicleLicensePlate() {
        String licensePlate = "";

        for (int i = 0; i < 3; i++) {
            licensePlate += generateRandomLetter();
        }

        licensePlate += "-";

        for(int i=0; i<4; i++) {
            licensePlate += String.valueOf(generateRandomNumber());
        }

        return licensePlate;
    }

    public static String generateRandomLetter() {
        return String.valueOf((char) Math.floor(Math.random() * (90 - 65 + 1) + 65));
    }

    public static int generateRandomNumber() {
        return (int) Math.floor(Math.random() * 9);
    }
}
