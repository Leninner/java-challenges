package Lectura_Escritura;

import java.io.*;

/**
 *Tomando como referencia el ejercicio 2 de la tarea de escritura; desarrolle un
 * programa que cuente la cantidad de guiones que contiene cada cadena e imprima
 * en pantalla.
 */

public class MazabandaLenin_Ejercicio7 {
    public static void main(String[] args) {
        File file = getFile("D:\\Dev\\ejercicio_dos.txt");

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
                int guiones = 0;

                for(int i = 0; i < linea.length(); i++) {
                    if(linea.charAt(i) == '_') {
                        guiones++;
                    }
                }

                System.out.println("La cadena " + linea + " contiene " + guiones + " guiones.");
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
