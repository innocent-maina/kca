//  Write a program that outputs the first n numbers in a fibonacci sequence

import java.util.Scanner;

public class DoMineSix {
  public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int numberOfTerms = myScanner.nextInt();
    int checker = 1;
    int currentNumber = 1;
    int previousNumber = 1;
    do {
      System.out.print(currentNumber + " ");
      int sum = currentNumber + previousNumber;
      currentNumber = previousNumber;
      previousNumber = sum;
      checker = checker + 1;
    } while (numberOfTerms >= checker);
  }
}
