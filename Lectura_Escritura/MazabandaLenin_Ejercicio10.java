package Lectura_Escritura;

import java.io.*;

/**
 * Tomando como referencia el ejercicio 5 de la tarea de escritura: desarrolle un
 * programa que imprima a los alumnos en donde su promedio sea mayor a 8.
 */

public class MazabandaLenin_Ejercicio10 {
    public static void main(String[] args) {
        File file = getFile("D:\\Dev\\ejercicio_cinco.txt");

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

            while((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if(Double.parseDouble(datos[3]) > 8) {
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
