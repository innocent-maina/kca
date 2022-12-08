import java.util.Scanner;

public class sumOfNumbers{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int numbers = myScanner.nextInt();
        int digit;
        int sum = 0;
        do {
            digit = numbers % 10;
            sum = sum + digit;
            numbers = numbers / 10;
        } while (numbers > 0);
        System.out.println("Sum of digits is " + sum);
    }
}