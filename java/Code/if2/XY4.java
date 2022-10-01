import java.util.Scanner;

public class XY4 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the value of x");
    int x = myScanner.nextInt();
    int y = 0;
    if (x > 5) {
      y = 4 * x * x * x + 2 * x - 6;
    } else if (x < 5) {
      y = 3 * x * x - 4 * y + 12;
    } else if (x == 5) {
      y = 6 * x - 5;
    }
    System.out.println("THe value of y is " + y);
  }
}
