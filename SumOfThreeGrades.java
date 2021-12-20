import java.util.Scanner;

class SumOfThreeGrades {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)){
      System.out.println("Enter three grades: ");
      int grade1 = scanner.nextInt();
      int grade2 = scanner.nextInt();
      int grade3 = scanner.nextInt();
      int sum = grade1 + grade2 + grade3;
      System.out.println("The sum of the grades is " + sum);
    }
    catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
