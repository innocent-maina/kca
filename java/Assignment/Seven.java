import java.util.Scanner;

public class Seven {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        double moneyDeposited, targetAmount, interestRate, interestEarned, totalAmount;
        int years = 0;

        System.out.print("Enter the amount of money deposited: ");
        moneyDeposited = myScanner.nextDouble();

        System.out.print("Enter the target amount: ");
        targetAmount = myScanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        interestRate = myScanner.nextDouble();

        totalAmount = moneyDeposited;

        while(totalAmount < targetAmount) {
            interestEarned = totalAmount * (interestRate / 100);
            totalAmount += interestEarned;
            years++;
        }

        System.out.println("It will take " + years + " years for your money to reach your target.");
        System.out.println("By the end of this period, the amount in your account will be " + String.format("%.2f", totalAmount)
);


    }
}