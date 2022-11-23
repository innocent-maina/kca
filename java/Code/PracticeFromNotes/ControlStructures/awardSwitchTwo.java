import java.util.Scanner;

public class awardSwitchTwo {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the points scored");
    int points = myScanner.nextInt();
    switch(points) {
      case 4:
      case 3:
      case 2:
        System.out.println("The student has passed");
        break;
      case 1:
        System.out.println("The student has failed");
        break;
      default:
        System.out.println("The student did something");
    }
  }
}
