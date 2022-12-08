import java.util.*;

public class BetterCalculator {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        double sum = 0;
        double[] marks = new double[10];
        int i;


        for(i = 0; i < 10; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            marks[i] = myScanner.nextDouble();
            sum = sum + marks[i];
        }

        System.out.println("The analysis is as follows\n\n");

        for(i = 0; i < 10; i++)
        {
            System.out.println("The student " + (i + 1) + " got " + marks[i]);
        }

        System.out.println("The sum of all marks is " + sum);
        System.out.println("The average mark is " + sum / 10);
    }
}
