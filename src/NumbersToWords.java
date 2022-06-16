package src;

import java.util.Scanner;

public class NumbersToWords {
    public static String getUnidades(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String getDecenas(int number) {
        switch (number) {
            case 1:
                return "ten";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String elevenToNineteen(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordNumber = "";
        int unidad = 0;
        int decena = 0;
        int number;

        do {
            System.out.println("\nIngresa un número");
            System.out.print("-> ");
            number = scan.nextInt();

            unidad = number % 10;
            decena = number / 10;

            if (number == 100) {
                wordNumber = "one hundred";
            } else if (number >= 10 && number <= 19) {
                wordNumber = elevenToNineteen(number);
            } else if (number == 0) {
                wordNumber = "zero";
            } else {
                wordNumber = getDecenas(decena) + " " + getUnidades(unidad);
            }

            System.out.println("El número es: " + wordNumber);

            System.out.println("\nIngresar otro número? (negativos para " +
                    "terminar)");
        } while (number >= 0);
    }
}
