// Write a program that when run, produces a menu showing beer brands and their prices and then prompts the user enter his/her choice (1,2,3 or 4). The user is then asked how many bottles he/she wants. He is then given the total cost (depending on the cost of the beer chosen) as the output. See sample dialog below. If he/she enters an invalid choice e.g. 8, he/she should get an error message.

// use the if…else statement

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Carlsberg - 100");
        System.out.println("2. Heineken - 150");
        System.out.println("3. Guinness - 200");
        System.out.println("4. Budweiser - 250");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("Enter the number of bottles: ");
        int bottles = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Total cost: " + bottles * 100);
        } else if (choice == 2) {
            System.out.println("Total cost: " + bottles * 150);
        } else if (choice == 3) {
            System.out.println("Total cost: " + bottles * 200);
        } else if (choice == 4) {
            System.out.println("Total cost: " + bottles * 250);
        } else {
            System.out.println("Error: Invalid choice!");
        }
    }
}
