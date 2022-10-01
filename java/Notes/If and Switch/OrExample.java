import java.util.Scanner;

class OrExample
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double marks;

      System.out.print("\nEnter marks the student scored: ");
      marks = myScanner.nextDouble();
        
      if(marks < 0 || marks > 100)
         System.out.println(marks + " is a INVALID mark.\n");
      else
         System.out.println(marks + " is an VALID mark.\n");
   }
}