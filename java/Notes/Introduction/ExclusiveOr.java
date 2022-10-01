import java.util.Scanner;

class ExclusiveOr
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int a,b;

      System.out.print("\nEnter two integers: ");
      a = myScanner.nextInt();
      b = myScanner.nextInt();

      if(a == 0 ^ b == 0)
         System.out.println("\nOnly one of the values is equal to zero.");
      else
         System.out.println("\nEither both values are zero or non-zero.");
   }
}