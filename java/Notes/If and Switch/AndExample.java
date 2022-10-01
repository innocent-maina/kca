import java.util.Scanner;

class AndExample
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double marks;

      System.out.print("\nEnter marks the student scored: ");
      marks = myScanner.nextDouble();
        
      if(marks >= 0 && marks <= 100)
         System.out.println(marks + " is a VALID mark.\n");
      else
         System.out.println(marks + " is an INVALID mark.\n");
   }
}
