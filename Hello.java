import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
          System.out.println("Hello, World!");
          System.out.println("What is your name?");
          String name = scanner.nextLine();
          System.out.println("Hello, " + name + "!");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}