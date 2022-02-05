import java.util.Scanner;

public class isCorrectDate {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter a date: ");
      String date = scan.nextLine();

      String[] dateSplit = date.split("/");

      int day = Integer.parseInt(dateSplit[0]);
      int month = Integer.parseInt(dateSplit[1]);
      int year = Integer.parseInt(dateSplit[2]);

      if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0 && year <= 9999) {
        System.out.println("The date is correct.");
      } else {
        System.out.println("The date is incorrect.");
      }

    }
  }
}
