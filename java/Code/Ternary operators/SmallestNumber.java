import java.util.Scanner;

public class SmallestNumber {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = myScanner.nextInt();
    int b = myScanner.nextInt();
    int c = myScanner.nextInt();
    int smaller = a < b ? a : b;
    int smallest = smaller < c ? smaller : c;
    System.out.println("The smallest number is: " + smallest);
  }
}
