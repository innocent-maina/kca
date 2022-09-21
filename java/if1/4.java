// Write a program that prompts the user for two numbers and then computes them using the following rules. If the first number is greater than the second one, the second number is subtracted from the first one. If the second number is greater than the first one, the first number is divided by the second one. Otherwise the two numbers are added.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Result: " + (number1 - number2));
        } else if (number2 > number1) {
            System.out.println("Result: " + (number1 / number2));
        } else {
            System.out.println("Result: " + (number1 + number2));
        }
    }
}
