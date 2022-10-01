import java.util.Scanner;

public class NegativePositive5 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = myScanner.nextInt();
    if (number < 0) {
      System.out.println("NEGATIVE");
    } else if (number > 0) {
      System.out.println("POSITIVE");
    } else {
      System.out.println("ZERO");
    }
  }
}
