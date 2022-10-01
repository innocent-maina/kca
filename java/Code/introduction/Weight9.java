import java.util.Scanner;

public class Weight9 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the weight in grams: ");
    double weight = myScanner.nextDouble();
    System.out.println("The weight of the package is: " + (weight / 1000) + " kilograms");
    System.out.println("It takes " + (1000 / weight) + " such packages to form one kilogram");
  }
}
