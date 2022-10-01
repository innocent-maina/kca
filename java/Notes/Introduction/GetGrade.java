import java.util.Scanner;

class GetGrade
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      char grade;

      System.out.print("\nEnter the grade the student scored:> ");
      grade = myScanner.findInLine(".").charAt(0);

      System.out.println("\nThe student scored grade " + grade);
   }
}
