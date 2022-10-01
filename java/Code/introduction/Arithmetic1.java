import java.util.Scanner;

public class Arithmetic1 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter three numbers to perform operations on: ->");
    int a = myScanner.nextInt();
    int b = myScanner.nextInt();
    int c = myScanner.nextInt();
    System.out.println("The sum of the numbers is:" + (a + b + c));
    System.out.println("The product of the numbers is: " + ( a * b * c));
    System.out.println("The average of the numbers is: " +(a + b + c) / 3);
  }
}
