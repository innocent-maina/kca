//  Write a program that accept int and compute sum of its digis
import java.util.Scanner;
public class DoMineSeven {
  public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = myScanner.nextInt();
    int sum = 0;
    int singleDigit = 0;
    int numberOfDigits = 0;
    do {
      // Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
      singleDigit = number % 10;
      sum = sum + singleDigit;
      number = number / 10;
    } while (number > 0);
    System.out.println("Sum of digits: " + sum);
  }
}
