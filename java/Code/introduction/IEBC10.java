import java.util.Scanner;

public class IEBC10 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the age of your guy: ");
    int age = myScanner.nextInt();
    if (age >= 18) {
      System.out.println("You can vote.");
    } else {
      System.out.println("You are too young to vote.");
    }
  }
}
