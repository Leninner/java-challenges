package src;

import java.util.Scanner;

public class salaryWeekly {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Ingresa las horas semanales trabajadas: ");
      int horas = scan.nextInt();

      if (horas <= 40) {
        System.out.println("El salario semanal del trabajador es: " + (horas * 16));
      } else {
        System.out.println("El salario seamanal del trabajador es: " + ((40 * 16) + ((horas - 40) * 20)));
      }
    }
  }
}
