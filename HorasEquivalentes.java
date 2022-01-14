import java.util.Scanner;

public class HorasEquivalentes {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
      System.out.print("Ingrese el total de horas: ");
      
      int horasTotales = scan.nextInt();
      int dias = horasTotales / 24;
      int semanas = dias / 7; 

      System.out.println("El equivalente en semanas es: " + semanas);
      System.out.println("El equivalente en dias es: " + dias);
      System.out.println("El equivalente en horas es: " + horasTotales);
    }
  }
}