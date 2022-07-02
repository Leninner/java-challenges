package Lectura_Escritura;

import java.io.*;

/**
 * Tomando como referencia el ejercicio 4 de la tarea de escritura; desarrolle un
 * programa que lea el listado de placas e imprima en pantalla únicamente aquellas
 * que terminen en un número par.
 */

public class MazabandaLenin_Ejercicio9 {
    public static void main(String[] args) {
        File file = getFile("D:\\Dev\\ejercicio_cuatro.txt");

        try {
            readFile(file);
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File getFile(String path) {
        return new File(path);
    }

    public static boolean isEvenPlate(String plate) {
        return plate.charAt(plate.length() - 1) % 2 == 0;
    }

    public static void readFile(File file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        try {
            String linea;

            while((linea = br.readLine()) != null) {
                if(isEvenPlate(linea)) {
                    System.out.println(linea);
                }
            }
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
