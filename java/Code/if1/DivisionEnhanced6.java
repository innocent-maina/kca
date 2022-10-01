import java.util.Scanner;

public class DivisionEnhanced6 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter two numbers to perform divison on: ");
    int num1 = myScanner.nextInt();
    int num2 = myScanner.nextInt();
    if (num1 > 0 && num2 > 0) {
      if (num1 > num2) {
        System.out.println("The result is " + (num1 / num2));
      } else if (num2 > num1) {
        System.out.println("The result is " + (num2 / num1));
      }
    } else {
      System.out.println("The numbers cannot be less than zero");
    }
  }
}
