package src;

import java.util.Scanner;

public class ejercicio {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Ingresa un nombre de usuario de Twitter");
    String nombre = scan.nextLine();

    String regexnombre = "^@([a-zA-Z0-9_]{1,15})$";

    if (nombre.matches(regexnombre)) {
      System.out.println("El nombre de usuario es correcto");
    } else {
      System.out.println("El nombre de usuario no es correcto");
    }
    scan.close();

  }
}
