// Write a program that accepts marks scored in five subjects and then computes the average and prints the order of merit based on the average mark.
// Average Mark
// Order of Merit
// 75 – 100
// Distinction
// 65 – 75
// Credit
// 50 – 65
// Pass
// 0 – 50
// Fail.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks scored in five subjects: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int average = (a + b + c + d + e) / 5;
        System.out.println("Average: " + average);
        if (average >= 75 && average <= 100) {
            System.out.println("Order of Merit: Distinction");
        } else if (average >= 65 && average < 75) {
            System.out.println("Order of Merit: Credit");
        } else if (average >= 50 && average < 65) {
            System.out.println("Order of Merit: Pass");
        } else if (average >= 0 && average < 50) {
            System.out.println("Order of Merit: Fail");
        }
    }
}
