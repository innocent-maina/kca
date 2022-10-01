// Write a program that accepts the age of a person, if the person is 18 and above, it should print You can vote. otherwise it should print You are too young to vote.

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You are too young to vote.");
        }
    }
}
