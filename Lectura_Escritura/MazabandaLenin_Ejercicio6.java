package Lectura_Escritura;

import java.io.*;

/**
 * Tomando como referencia el ejercicio 1 de la tarea de escritura; desarrolle un
 * programa que lea el listado de nombres e imprima la longitud de caracteres de cada
 * uno de los nombres.
 */

public class MazabandaLenin_Ejercicio6 {
    public static void main(String[] args) {
        File file = getFile("D:\\Dev\\ejercicio_uno.txt");

        try {
            readFile(file);
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File getFile(String path) {
        return new File(path);
    }

    public static void readFile(File file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        try {
            String linea;

            while((linea = br.readLine()) != null)
                System.out.println(linea + " tiene " + linea.trim().length() + " caracteres");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally{
            try{
                fr.close();
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
