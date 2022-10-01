import java.util.Scanner;

public class BeerSwitch {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("**** Jamal and Daughters Pub****");
    System.out.println("Beer Brand               Price");
    System.out.println("1. Tusker                100");
    System.out.println("2. Pilsner               120");
    System.out.println("3. Smirnoff Ice          140");
    System.out.println("4. White Cap             90");
    System.out.println("Enter your choice: ");
    int choice = myScanner.nextInt();
    switch (choice) {
      case 1:
        System.out.println("How many bottles of Tusker do you want? ");
        int bottles1 = myScanner.nextInt();
        System.out.println(bottles1 + "bottles of Tusker will cost you Kshs. " + (bottles1 * 100));
        break;
      case 2:
        System.out.println("How many bottles of Pilsner do you want? ");
        int bottles2 = myScanner.nextInt();
        System.out.println(bottles2 + "bottles of Pilsner will cost you Kshs. " + (bottles2 * 120));
        break;
      case 3:
        System.out.println("How many bottles of Smirmoff Ice do you want? ");
        int bottles3 = myScanner.nextInt();
        System.out.println(bottles3 + "bottles of Smirmoff Ice will cost you Kshs. " + (bottles3 * 140));
        break;
      case 4:
        System.out.println("How many bottles of White Cap do you want? ");
        int bottles4 = myScanner.nextInt();
        System.out.println(bottles4 + "bottles of White Cap will cost you Kshs. " + (bottles4 * 90));
        break;
    }
  }
}
