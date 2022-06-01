package src;

import java.util.ArrayList;

public class FindTheFirstRepeated {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(5);
    numbers.add(5);
    numbers.add(2);
    numbers.add(1);

    // numbers.indexOf(numbers.get(i)) == i

    for (int i = 0; i < numbers.size(); i++) {
      if (i != numbers.indexOf(numbers.get(i))) {
        System.out.println("El primer número repetido es: " + numbers.get(i));
        break;
      }
    }
  }
}
