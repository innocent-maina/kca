import java.util.Scanner;

public class Radius2 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the radius of the circle to perform operations on:");
    int radius = myScanner.nextInt();
    System.out.println("The area of the circle is: " + (3.14 * radius * radius));
    System.out.println("The circumference of the circle is " + (3.14 * (radius * 2)));
  }
}
