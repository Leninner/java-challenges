import java.util.Scanner;

public class moveNSpaces {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
      System.out.println("Enter 4 letters: ");
      String a = scan.nextLine();
      String t = scan.nextLine();
      String u = scan.nextLine();
      String v = scan.nextLine();

      System.out.print("Enter a number: ");
      int n = Integer.parseInt(scan.nextLine());


      byte[] ascii = a.getBytes();
      byte[] ascii2 = t.getBytes();
      byte[] ascii3 = u.getBytes();
      byte[] ascii4 = v.getBytes();
;

      System.out.println(Character.toString(ascii[0] + n));
      System.out.println(Character.toString(ascii2[0] + n));
      System.out.println(Character.toString(ascii3[0] + n));
      System.out.println(Character.toString(ascii4[0] + n));

    }
  }
}
