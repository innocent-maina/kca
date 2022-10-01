import java.util.Scanner;

public class Roots11 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a random integer");
    int number = myScanner.nextInt();
    System.out.println("The square of the number is: " + Math.pow(number, 2));
    System.out.println("The cube of the number is: " + Math.pow(number, 3));
    System.out.println("The square root of the number is: " + Math.sqrt(number));
    System.out.println("The cube root of the number is: " + Math.cbrt(number));
  }
}
