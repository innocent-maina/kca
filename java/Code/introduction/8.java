// Write a program that accepts measurements in kilometers and the converts and displays them in metres. E.g. if someone enters 0.4 (kilometers) the output should take the form 0.4 kilometers = 400 metres.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a measurement in km: ");
        double km = scanner.nextDouble();
        System.out.println(km + "km is " + km * 1000 + "m");
    }
}
