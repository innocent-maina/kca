import java.util.Scanner;

public class RightAngled4 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the base of the triangle:");
    int base = myScanner.nextInt();
    System.out.println("Enter the height of the triangle:");
    int height = myScanner.nextInt();
    System.out.println("The area of the right angled triangle is "+ (height * base) / 2);
  }
}
