//         3) Write a program using the tax information below: -
// Gross Pay                  	      Tax Rate
// Over 40,000			30%
// >= 30,000 but below 40,000	25%
// >=20,000 but below 30,000	15%
// >=10,000 but below 20,000	10%
// Below 10,000			no tax.
// Write a program that accepts the gross pay and computes both the tax amount and the net pay. (Assume the net pay is gross pay – tax amount)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gross pay: ");
        double grossPay = scanner.nextDouble();
        double tax = 0;
        if (grossPay >= 40000) {
            tax = grossPay * 0.3;
        } else if (grossPay >= 30000) {
            tax = grossPay * 0.25;
        } else if (grossPay >= 20000) {
            tax = grossPay * 0.15;
        } else if (grossPay >= 10000) {
            tax = grossPay * 0.1;
        }
        System.out.println("Tax: " + tax);
        System.out.println("Net pay: " + (grossPay - tax));
    }
}
