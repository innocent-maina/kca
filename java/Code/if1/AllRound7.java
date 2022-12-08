import java.util.Scanner;

public class AllRound7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a figure: ");
        String figure = scanner.nextLine();
        // turn it to lower case
        figure = figure.toLowerCase();
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
