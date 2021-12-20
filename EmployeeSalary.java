import java.util.Scanner;

public class EmployeeSalary {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)){;
      System.out.print("Enter the name of the employee: ");
      String nameEmployee = entrada.nextLine();
      System.out.print("Enter the salary per hour of " + nameEmployee + ": ");
      float salaryPerHour = entrada.nextFloat();
      System.out.print("Enter the hours worked in the week by " + nameEmployee + ": ");
      int hoursWorked = entrada.nextInt();

      System.out.print("The salary of the week for " + nameEmployee + " is: " + (salaryPerHour * hoursWorked));
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
