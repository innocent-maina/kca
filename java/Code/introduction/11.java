// Write a program that accepts a number and then outputs it’s square, cube, square root and cube root.

import java.util.Scanner;

public class NumbersRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.println("Square: " + number * number);
        System.out.println("Cube: " + number * number * number);
        System.out.println("Square root: " + Math.sqrt(number));
        System.out.println("Cube root: " + Math.cbrt(number));
    }
}
