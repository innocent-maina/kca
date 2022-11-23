import java.util.Scanner;

public class printBig {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the two numbers to be evaluated");
    int a = myScanner.nextInt();
    int b = myScanner.nextInt();
    if (a > b) {
      System.out.println("The first number " + a + " is greater than the second number " + b);
    } else {
      System.out.println("The second number " + b + " is greater than the first number " + a);
    }
  }
}
