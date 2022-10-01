import java.util.Scanner;

class LargeNum
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int a,b,large;

      System.out.print("\nEnter two numbers:> ");
      a = myScanner.nextInt();
      b = myScanner.nextInt();

      if(a > b)
         large = a;
      else
         large = b;

      System.out.println("\nBetween " + a + " and " + b + " the largest is " + large);
   }
}
