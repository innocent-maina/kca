// Write a program that accepts an integer then reverses it
import java.util.Scanner;
public class DoMineEight {
  public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = myScanner.nextInt();
    int singleDigit = 0;
    String reversedNumber = "";
    do {
      singleDigit = number % 10;
      number = number / 10;
      System.out.print(singleDigit);
      reversedNumber = reversedNumber + Integer.toString(singleDigit);
    } while (number > 0);
  }
}
