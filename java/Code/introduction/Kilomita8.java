import java.util.Scanner;

public class Kilomita8 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the kilometers to convert to meters: ");
    double kilometers = myScanner.nextDouble();
    System.out.println(kilometers + "kilometers = " + (kilometers * 1000) + " meters");
  }
}
