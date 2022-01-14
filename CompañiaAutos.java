import java.util.Scanner;

public class CompañiaAutos {
  public static void main(String[] args) {
    try(Scanner entrada = new Scanner(System.in)){
      System.out.print("Ingrese el nombre del empleado: ");
      String nameEmployee = entrada.nextLine();
      System.out.print("Ingrese la cantidad de carros vendidos por " + nameEmployee + ": ");
      int carsSold = entrada.nextInt();
      float commissionPerCar = carsSold * 150;
      float percentajePerCar = 0;

      for(int i=0; i<carsSold; i++){
        System.out.println("Ingrese el precio del carro " + (i + 1) + ": ");
        float priceCar = entrada.nextFloat();
        percentajePerCar += priceCar * 0.05f;
      }

      System.out.println("Es salario mensual de " + nameEmployee + " es: $" + (1000 + commissionPerCar + percentajePerCar));
    }
  }
}
