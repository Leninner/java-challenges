package src;

import java.util.Scanner;

public class FinalGrade {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Ingresa las notas del estudiante: ");

      System.out.print("Nota 1: ");
      float gradeOne = scan.nextFloat() * 0.1f;
      System.out.print("Nota 2: ");
      float gradeTwo = scan.nextFloat() * 0.25f;
      System.out.print("Nota 3: ");
      float gradeThree = scan.nextFloat() * 0.25f;
      System.out.print("Nota 4: ");
      float gradeFour = scan.nextFloat() * 0.4f;

      System.out.println("La nota final del estudiante es: " + (gradeOne + gradeTwo + gradeThree + gradeFour));
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
