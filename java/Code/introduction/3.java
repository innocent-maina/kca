// Write a program that accepts the width and length of a rectangle and computes both it’s area and perimeter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of a rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the length of a rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Area: " + width * length);
        System.out.println("Perimeter: " + 2 * (width + length));
    }
}
