//         2) Write a program that prompts the user for two numbers. The program then prompts the user for the operator (+, - , * , / or %). The user is the given the answer depending on the operator entered. If he enters an invalid operator, he/she should get an error message. See sample dialog below.
// Sample Dialog



//     a) Use the if…else statement

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, / or %): ");
        char operator = scanner.next().charAt(0);
        if (operator == '+') {
            System.out.println("Result: " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("Result: " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("Result: " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("Result: " + (number1 / number2));
        } else if (operator == '%') {
            System.out.println("Result: " + (number1 % number2));
        } else {
            System.out.println("Error: Invalid operator!");
        }
    }
}
