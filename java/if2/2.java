// //     2) In a certain organization, people are taxed using the following tax bracket.
// // Salary
// // Tax rate
// >= 20000
// 15%
// 10000 – 20000
// 10%
// 0 – 10000
// Not taxed
// Write a program that accepts someone’s salary and computes both their tax amount and net salary (Gross – tax)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        double tax = 0;
        if (salary >= 20000) {
            tax = salary * 0.15;
        } else if (salary >= 10000) {
            tax = salary * 0.1;
        }
        System.out.println("Tax: " + tax);
        System.out.println("Net salary: " + (salary - tax));
    }
}
