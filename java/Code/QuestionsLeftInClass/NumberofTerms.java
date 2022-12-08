import java.util.Scanner;

public class NumberofTerms{
    public static void main(String[] args) {
        int i = 0, checker = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numberOfTerms = myScanner.nextInt();

        do {
            System.out.println(i);
            i = i + 1;
            checker = checker + 1;
        } while (numberOfTerms >= checker);
    }
}