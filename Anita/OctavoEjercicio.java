package Anita;

import java.util.Scanner;

public class OctavoEjercicio {
  public static void main(String[] args) {
    // Construir un programa que calcule la factorial de un valor numérico
    // introducido como
    // parámetro o argumento en la línea de comandos. (Utilice la sentencia
    // do-while)

    Scanner scan = new Scanner(System.in);

    int numero = 0;

    do {
      System.out.println("\nIngresa un número");
      System.out.print("-> ");
      numero = scan.nextInt();

      if (numero != 0) {
        long factorial = 1;
        int auxNumero = numero;

        while (auxNumero > 0) {
          factorial *= auxNumero;
          auxNumero--;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
      }
    } while (numero != 0);

    scan.close();
  }
}
