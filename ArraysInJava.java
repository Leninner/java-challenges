public class ArraysInJava {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };

    String[] names = { "John", "Paul", "George", "Ringo", "Lenin" };

    String[] name = new String[5];

    name[0] = "John";
    name[1] = "Paul";
    name[2] = "George";
    name[3] = "Ringo";
    name[4] = "Lenin";

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
      System.out.println(names[i]);
    }
  }
}
