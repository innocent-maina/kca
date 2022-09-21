// A number is said to be evenly divisible by 9 if it is divisible by 9 and at the same time it is even. For example 18 is evenly divisible by 9 but 27 is not. A program is required that accepts an integer and checks whether it is evenly divisible by 9 or not and then prints an appropriate message.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 9 == 0 && number % 2 == 0) {
            System.out.println("The number is evenly divisible by 9.");
        } else {
            System.out.println("The number is not evenly divisible by 9.");
        }
    }
}
