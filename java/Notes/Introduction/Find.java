import java.util.Scanner;

class Find
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String data;

      System.out.print("\nEnter a sentence:> ");
      data = myScanner.findInLine("\\d\\d\\d");

      System.out.println("\nThe data is " + data);
   }
}
