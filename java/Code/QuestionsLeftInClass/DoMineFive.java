import java.util.Scanner;

public class DoMineFive {
  public static void main (String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int numberOfTerms = myScanner.nextInt();
    int checker = 1;
    int i = 2;
    do {
      System.out.print(i + " ");
      i = i * 3;
      checker = checker + 1;
    } while (numberOfTerms >= checker);
  }
}
