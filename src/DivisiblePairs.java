package src;

import java.util.ArrayList;

public class DivisiblePairs {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    int k = 5;

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);

    int cont = 0;

    for (int i = 0; i < numbers.size(); i++) {
      for (int y = i + 1; y < numbers.size(); y++) {
        if ((numbers.get(i) + numbers.get(y)) % k == 0) {
          cont++;
        }
      }
    }

    System.out.println(cont);
  }
}
