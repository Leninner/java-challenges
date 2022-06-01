package src;

import java.util.Scanner;

public class Promedio {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Ingresa las notas del estudiante: ");

      float gradeOne = scan.nextFloat();
      float gradeTwo = scan.nextFloat();
      float gradeThree = scan.nextFloat();
      float gradeFour = scan.nextFloat();

      float promedio = (gradeOne + gradeTwo + gradeThree + gradeFour) / 4;
      System.out.println("El promedio del estudiante es: " + promedio);
    }
  }
}
