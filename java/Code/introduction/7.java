// Write a program that accepts distance traveled in metres and the time taken in minutes and then outputs the speed in kilometers per hour (km/h). E.g. if someone enters a distance (in metres) of 500 and a time (in minutes) of 15 the output for speed should be 2 km/h.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a distance in metres: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter a time in minutes: ");
        double time = scanner.nextDouble();
        System.out.println("Speed: " + distance / time * 60 / 1000 + "km/h");
    }
}
