import java.util.Scanner;

public class RoadRage8 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the vehicles speed: ");
    int speed = myScanner.nextInt();
    System.out.println("Enter the speed limit: ");
    int limit = myScanner.nextInt();
    int difference = speed - limit;
    int fine = 0;
    if (difference < 30) {
      fine = 2500;
    } else {
      fine = 4000;
    }
    System.out.println("Vehicle speed: " + speed + "km/h");
    System.out.println("Speed limit: " + limit + "km/h");
    System.out.println("Excess speed: " + difference + "km/h");
    System.out.println("Fine levied: " + fine + "kshs");
  }
}
