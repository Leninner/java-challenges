import java.util.Scanner;

class SumTwoNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter another number: ");
            int num2 = scanner.nextInt();
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
