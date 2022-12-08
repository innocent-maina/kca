import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) 
    {
        double sum = 0;
        double average = 0;
        double[] marks = new double[5];
        int i;

        Scanner myScanner = new Scanner(System.in);

        for(i = 0; i < 5; i++)
        {
            System.out.println("Enter marks for the student");
            marks[i] = myScanner.nextDouble();
            sum = sum + marks[i];
        }

        average = sum / 5;

        System.out.println("Analysis of the performance");

        for(i = 0; i < 5; i++)
        {
            System.out.println("Student " + i + " : " + marks[i]);
        }


        System.out.println("The total sum of the whole thing is " + sum);
        System.out.println("The average mark is " + average);
    }
}
