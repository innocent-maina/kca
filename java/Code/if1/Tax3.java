import java.util.Scanner;

public class Tax3 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the gross pay: ");
    double grossPay = myScanner.nextDouble();
    double tax = 0;
    if (grossPay >= 40000) {
      tax = grossPay * 0.3;
    } else if (grossPay >= 30000 && grossPay < 40000) {
      tax = grossPay * 0.25;
    } else if (grossPay >= 20000 && grossPay < 30000) {
      tax = grossPay * 0.15;
    } else if (grossPay >= 10000 && grossPay < 20000) {
      tax = grossPay * 0.10;
    } else if (grossPay < 10000) {
      tax = 0;
    }
    System.out.println("The tax is " + tax);
    System.out.println("The net pay is " + (grossPay - tax));
  }
}
