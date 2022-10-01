import java.util.Scanner;

class GetLarge
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int a,b;

      System.out.println("\nEnter two numbers:> ");
      a = myScanner.nextInt();
      b = myScanner.nextInt();

      if(a > b)
         System.out.println(a + " is larger than " + b);
      else
         System.out.println(b + " is larger than " + a);
   }
}
