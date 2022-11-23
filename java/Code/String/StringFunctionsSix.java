import java.util.Scanner;

class StringFunctionsSix
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double first, second;

      System.out.print("\nEnter your two floating point numbers (include decimals): ");
      first = myScanner.nextDouble();
      second = myScanner.nextDouble();
      
      System.out.println("\nFirst = " + String.format("%.2f",first));
      System.out.println("Second = " + String.format("%.2f",second));
   }
}
