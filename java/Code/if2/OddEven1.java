import java.util.Scanner;

public class OddEven1 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a number to check if it is odd or even: ");
    int number = myScanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("The number is Even");
    } else if (number % 2 != 0) {
      System.out.println("The number is Odd");
    }
  }
}
