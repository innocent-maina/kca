//     9) Write a program that accepts the weight of a package in grams and then converts it to kilograms and also specifies how many such packages form one kilogram. For example, if the user enters the weight (in grams) of the package as 100, the output should be;
// The weight of the package is 0.1 kilograms.
// It takes 10 such packages to form one kilogram.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weight in grams: ");
        double grams = scanner.nextDouble();
        System.out.println("The weight of the package is " + grams / 1000 + " kilograms.");
        System.out.println("It takes " + 1000 / grams + " such packages to form one kilogram.");
    }
}
