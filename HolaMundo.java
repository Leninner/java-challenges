import java.util.Scanner;

public class HolaMundo {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
      System.out.println("Hola, cuál es tu nombre?");

      String name = scan.nextLine();
    
      System.out.println("Hola, " + name + "!, eres muy guapo!");
    }
  }
}
