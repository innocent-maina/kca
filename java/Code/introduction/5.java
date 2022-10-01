// Write a program that accepts measurements in cm and converts them into metres. If someone enters 200 for example, the output should take the form;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a measurement in cm: ");
        double cm = scanner.nextDouble();
        System.out.println(cm + "cm is " + cm / 100 + "m");
    }
}
