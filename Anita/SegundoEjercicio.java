package Anita;

import java.util.Scanner;

public class SegundoEjercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double nota = 0;
    int mayoresA8 = 0;
    int menoresA8 = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.println("Ingrese la nota del estudiante " + i);
      nota = scan.nextDouble();

      if (nota >= 8) {
        mayoresA8++;
      } else {
        menoresA8++;
      }
    }

    scan.close();

    System.out.println("Hay " + mayoresA8 + " estudiantes con notas mayores a 8");
    System.out.println("Hay " + menoresA8 + " estudiantes con notas menores a 8");
  }
}
