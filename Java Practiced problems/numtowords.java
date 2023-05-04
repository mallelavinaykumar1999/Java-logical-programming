/******************************************************************************
Write a JAVAprogram to enter a number and print it in words.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 20) {
            System.out.println(units[number]);
        } else if (number < 100) {
            int remainder = number % 10;
            int quotient = number / 10;
            System.out.println(tens[quotient] + " " + units[remainder]);
        } else if (number < 1000) {
            int remainder = number % 100;
            int quotient = number / 100;
            System.out.println(units[quotient] + " hundred " + ((remainder != 0) ? "and " : "") + convert(remainder));
        } else {
            System.out.println("Number out of range");
        }
    }
public static String convert(int number) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 20) {
            return units[number];
        } else if (number < 100) {
            int remainder = number % 10;
            int quotient = number / 10;
            return tens[quotient] + " " + units[remainder];
        } else if (number < 1000) {
            int remainder = number % 100;
            int quotient = number / 100;
            return units[quotient] + " hundred " + ((remainder != 0) ? "and " : "") + convert(remainder);
        } else {
            return "Number out of range";
        }
    }
}
