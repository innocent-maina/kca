// Write a program that accepts temperature in degrees Celsius and converts and outputs it in degrees Fahrenheit.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " degrees Celsius is " + (celsius * 9 / 5 + 32) + " degrees Fahrenheit");
    }
}
