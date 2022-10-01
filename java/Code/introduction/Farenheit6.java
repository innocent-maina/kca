import java.util.Scanner;

public class Farenheit6 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the temparature in degrees celsius: ");
    double degreesCelsius = myScanner.nextDouble();
    System.out.println("Temperature in farenheit is: " + (degreesCelsius * 1.8 + 32));
  }
}
