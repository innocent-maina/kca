import java.util.Scanner;

public class IShowSpeed7 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the distance traveled in metres");
    double distance = myScanner.nextDouble();
    System.out.println("Enter the time spent in minutes");
    double time = myScanner.nextDouble();
    System.out.println("The speed travelled is: " + (distance / time * 60 / 1000) + "km/h");
  }
}
