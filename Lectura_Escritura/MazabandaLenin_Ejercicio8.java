package Lectura_Escritura;

import java.io.*;

/**
 *Tomando como referencia el ejercicio 3 de la tarea de escritura; desarrolle un
 * programa que cuente la cantidad de arroba (@), la cantidad de números 3 y la
 * cantidad de ceros que contienen todas las cadenas. Imprima los totales en pantalla.
 */

public class MazabandaLenin_Ejercicio8 {
    public static void main(String[] args) {
        File file = getFile("D:\\Dev\\ejercicio_tres.txt");

        try {
            readFile(file);
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File getFile(String path) {
        return new File(path);
    }

    public static int[] getCharactersCount(String word){
        int countArrobas = 0;
        int countTres = 0;
        int countCeros = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == '@') {
                countArrobas++;
            } else if(word.charAt(i) == '3') {
                countTres++;
            } else if(word.charAt(i) == '0') {
                countCeros++;
            }
        }

        return new int[] {countArrobas, countTres, countCeros};
    }

    public static void readFile(File file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        try {
            String linea;

            while((linea = br.readLine()) != null) {
                int[] charactersCount = getCharactersCount(linea);
                System.out.println("Linea: " + linea);
                System.out.println("Arrobas: " + charactersCount[0]);
                System.out.println("Tres: " + charactersCount[1]);
                System.out.println("Ceros: " + charactersCount[2] + "\n");
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
