// Write a program that can be used by a policeman to determine if a vehicle has exceeded the speed limit and to levy a fine. The policeman should enter the vehicles speed and the speed limit. If the speed limit is exceeded by less than 30kph a fine of Kshs. 2500 should be charged. Otherwise a fine of Kshs 4000 is charged. Your program should then output (in a suitable format) the vehicle speed, the speed limit, the excess speed and the fine levied.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed limit: ");
        int speedLimit = scanner.nextInt();
        System.out.println("Enter the vehicle speed: ");
        int vehicleSpeed = scanner.nextInt();
        int excessSpeed = vehicleSpeed - speedLimit;
        int fine = 0;
        if (excessSpeed < 30) {
            fine = 2500;
        } else {
            fine = 4000;
        }
        System.out.println("Vehicle speed: " + vehicleSpeed);
        System.out.println("Speed limit: " + speedLimit);
        System.out.println("Excess speed: " + excessSpeed);
        System.out.println("Fine: " + fine);
    }
}
