import java.util.Scanner;

public class Rectangle3 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle: ");
    double width = myScanner.nextDouble();
    System.out.println("Enter the height of the rectangle: ");
    double height = myScanner.nextDouble();
    System.out.println("The are of the rectangle is: " + (width * height));
    System.out.println("The perimeter of the rectangle is: " + (width + height) * 2);
  }
}
