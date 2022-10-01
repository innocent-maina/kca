import java.util.Scanner;

public class Conditions4 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter two numbers we do something with them: ");
    int a = myScanner.nextInt();
    int b = myScanner.nextInt();
    if (a > b) {
      int result = a - b;
      System.out.println("The result is " + result);
    } else if (b > a) {
      int result = b / a;
      System.out.println("The result is " + result);
    } else {
      int result = a + b;
      System.out.println("The result is " + result);
    }
  }
}
