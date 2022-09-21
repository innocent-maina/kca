// Write a program to read a value from the keyboard and output the phrase NEGATIVE if the number is negative, POSITIVE if the number is positive or ZERO otherwise.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }
}
