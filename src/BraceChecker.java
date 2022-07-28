package src;

import java.util.*;

public class BraceChecker {

  public static boolean isValid(String braces) {
    Stack<Character> currentBrackets = new Stack<>();

    for (int i = 0; i < braces.length(); i++) {
      if (currentBrackets.size() > 0 && isClosing(currentBrackets.peek(), braces.charAt(i))) {
        currentBrackets.pop();
      } else {
        currentBrackets.push(braces.charAt(i));
      }
    }

    return currentBrackets.size() == 0;
  }

  public static boolean isClosing(char x, char c) {
    return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
  }

  public static void main(String[] args) {
    System.out.println(isValid("(){}[]")); // true
    System.out.println(isValid("([{}])")); // true
    System.out.println(isValid("(}")); // false
    System.out.println(isValid("[(])")); // false
    System.out.println(isValid("[({})](]")); // false
    System.out.println(isValid("[]")); // true
    System.out.println(isValid(")(}{][")); // false
    System.out.println(isValid("())({}}{()][][")); // false
  }

  // public class BraceChecker {

  // public boolean isValid(String braces) {
  // Stack<Character> s = new Stack<>();
  // for (char c : braces.toCharArray())
  // if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
  // else s.push(c);
  // return s.size() == 0;
  // }

  // public boolean isClosing(char x, char c) {
  // return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c ==
  // ']');
  // }

}
