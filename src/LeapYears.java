package src;

import javax.swing.JOptionPane;

public class LeapYears {
  public static void main(String[] args) {
    final int gregorioStart = 1582;

    int userYear = Integer
        .parseInt(JOptionPane.showInputDialog("Hey, dime el año que quiéres averiguar si es bisiesto o no"));

    if (userYear < gregorioStart) {
      if (userYear % 4 == 0) {
        JOptionPane.showMessageDialog(null, "You are in a Leap Year. You are in Julian Calendar");
      } else {
        JOptionPane.showMessageDialog(null, "You aren´t in a Leap Year. You are in Julian Calendar ");
      }
    } else if (userYear % 100 == 0) {
      if (userYear % 400 == 0) {
        JOptionPane.showMessageDialog(null,
            "You are in a leap year. This is a secular year. You are in gregorian calendar");
      } else {
        JOptionPane.showMessageDialog(null,
            "You aren´t in a leap year. This is a secular year. You are in gregorian calendar");
      }
    } else if (userYear % 4 == 0) {
      JOptionPane.showMessageDialog(null,
          "You are in a leap year. This isn´t a secular year. You are in gregorian calendar");
    } else {
      JOptionPane.showMessageDialog(null,
          "You aren´t in a leap year. This isn´t a secular year. You are in gregorian calendar");
    }
  }
}
