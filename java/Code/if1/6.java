// Write a program that accepts two numbers and divides the bigger number by the smaller number and displays the results. The program should display an error message (and not perform the calculation) if the smaller number is zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            if (number2 != 0) {
                System.out.println("Result: " + number1 / number2);
            } else {
                System.out.println("Error: The second number is zero.");
            }
        } else {
            if (number1 != 0) {
                System.out.println("Result: " + number2 / number1);
            } else {
                System.out.println("Error: The first number is zero.");
            }
        }
    }
}
