// Write a program that computes the area of a right-angled triangle.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of a right-angled triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of a right-angled triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area: " + base * height / 2);
    }
}
