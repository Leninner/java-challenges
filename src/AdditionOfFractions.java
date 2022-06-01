package src;

public class AdditionOfFractions {
  public static void main(String[] args) {
    int base = 2, power = 1;
    double fraction = 0.5, accumulativeSum = 0;

    System.out.println("Potencia \t Fracción \t Suma");
    System.out.println("--------------------------------------------");

    while (fraction >= 0.000001) {
      accumulativeSum += fraction;
      System.out.printf("%d \t\t %.5f \t %.5f\n", power, fraction, accumulativeSum);
      power++;
      fraction = (1 / Math.pow(base, power));
    }
  }
}
