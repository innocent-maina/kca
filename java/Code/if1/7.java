// Write a program that computes the area & perimeter of either a rectangle, a circle or a right-angled triangle. The program should display a menu that enables the user to select the type of figure whose area & perimeter he/she wants to compute. Depending on the users choice, the program should prompt for the dimensions and perform the computations. The output should be: - The type of figure, the dimensions, the area and the perimeter. (NB:The calculation should be for only one figure at any one time.)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a figure: ");
        String figure = scanner.nextLine();
        if (figure.equals("rectangle")) {
            System.out.println("Enter the length: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width: ");
            double width = scanner.nextDouble();
            System.out.println("The area of the rectangle is " + length * width + ".");
            System.out.println("The perimeter of the rectangle is " + 2 * (length + width) + ".");
        } else if (figure.equals("circle")) {
            System.out.println("Enter the radius: ");
            double radius = scanner.nextDouble();
            System.out.println("The area of the circle is " + Math.PI * radius * radius + ".");
            System.out.println("The perimeter of the circle is " + 2 * Math.PI * radius + ".");
        } else if (figure.equals("triangle")) {
            System.out.println("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.println("Enter the height: ");
            double height = scanner.nextDouble();
            System.out.println("The area of the triangle is " + base * height / 2 + ".");
            System.out.println("The perimeter of the triangle is " + (base + height + Math.sqrt(base * base + height * height)) + ".");
        }
    }
}
