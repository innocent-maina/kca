import java.util.Scanner;

public class BeerIfElse {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("**** Jamal and Daughters Pub****");
    System.out.println("Beer Brand               Price");
    System.out.println("1. Tusker                100");
    System.out.println("2. Pilsner               120");
    System.out.println("3. Smirnoff Ice          140");
    System.out.println("4. White Cap             90");
    System.out.println("Enter your choice: ");
    int choice  = myScanner.nextInt();
    if (choice == 1) {
      System.out.println("How many bottles of Tusker do you want? ");
      int bottles = myScanner.nextInt();
      System.out.println(bottles + "bottles of Tusker will cost you Kshs. " + (bottles * 100));
    } else if (choice == 2) {
      System.out.println("How many bottles of Pilsner do you want? ");
      int bottles = myScanner.nextInt();
      System.out.println(bottles + "bottles of Pilsner will cost you Kshs. " + (bottles * 120));
    } else if (choice == 3) {
      System.out.println("How many bottles of Smirmoff Ice do you want? ");
      int bottles = myScanner.nextInt();
      System.out.println(bottles + "bottles of Smirmoff Ice will cost you Kshs. " + (bottles * 140));
    } else if (choice == 4) {
      System.out.println("How many bottles of White Cap do you want? ");
      int bottles = myScanner.nextInt();
      System.out.println(bottles + "bottles of White Cap will cost you Kshs. " + (bottles * 90));
    }
  }
}
