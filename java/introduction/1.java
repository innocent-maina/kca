// Write a program that accepts three numbers and computes their sum, product and average.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Sum: " + (a + b + c));
        System.out.println("Product: " + (a * b * c));
        System.out.println("Average: " + (a + b + c) / 3);
    }
}
