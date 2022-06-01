package src;

import java.util.Scanner;

public class Jairsin {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
      Boolean isOpen = true;

      int number;

      while (isOpen) {
        System.out.println("Ingresa un número");
        number = entrada.nextInt();

        switch (number) {
          case 10:
            System.out.println("Bien");
            break;

          case 50:
            System.out.println("Cool");
            break;

          case 45:
            System.out.println("Bieeen");
            isOpen = false;
            break;
        }
      }

    } catch (Exception e) {
      System.out.println("Eres" + e);
    }

  }
}
