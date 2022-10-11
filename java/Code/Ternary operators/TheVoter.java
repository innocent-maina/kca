//  Write a program that accepts somebody's age, if the age is 18 and above display 'You can vote', if not display "you can't vote'.
// Note: Don't use if statements. uSE ternary operators

import java.util.Scanner;

public class TheVoter {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = myScanner.nextInt();
    String vote = age >= 18 ? "You can vote" : "You can't vote";
    System.out.println(vote);
  }
}
