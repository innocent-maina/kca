import java.util.Scanner;

class LargeCon
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double num1, num2, large;

      System.out.println("\nEnter two numbers: ");
      num1 = myScanner.nextDouble();
      num2 = myScanner.nextDouble();

      large = num1 > num2?num1:num2;

      System.out.println("\nBetween " + num1 + " and " + num2 + " the largest is " + large);
   }
}