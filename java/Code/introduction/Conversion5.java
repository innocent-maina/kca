import java.util.Scanner;

public class Conversion5 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the value in cm to be converted: ");
    int cm = myScanner.nextInt();
    System.out.println(cm + " cm = " + (cm / 100) + " metres");
  }
}
