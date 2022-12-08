import java.util.Scanner;

public class prisonBreak{
    public static void main(String[] args) {

        int checker = 0, numberOfTerms, currentNumber = 0, previousNumber = 0, sum = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        numberOfTerms = myScanner.nextInt();

        do {
            System.out.println(currentNumber + " ");
      sum = currentNumber + previousNumber;
      currentNumber = previousNumber;
      previousNumber = sum;
      checker = checker + 1;
        } while (numberOfTerms >= checker);
    }
}