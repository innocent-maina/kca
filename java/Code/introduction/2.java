// Write a program that accepts the radius of a circle and computes both it’s area and circumference.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area: " + Math.PI * radius * radius);
        System.out.println("Circumference: " + 2 * Math.PI * radius);
    }
}
