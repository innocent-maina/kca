import java.util.Scanner;

class SwitchGradeTwo
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      char grade;

      System.out.print("\nEnter the grade the student got:> ");
      grade = myScanner.findInLine(".").charAt(0);

      switch(Character.toUpperCase(grade))
      {
      case 'A': System.out.println("\nThe student got a Distinction.");
              break;
      case 'B':
      case 'C': System.out.println("\nThe student got a Credit.");
              break;
      case 'D': System.out.println("\nThe student got a Pass.");
              break;
      case 'E': System.out.println("\nThe student got a Fail.");
              break;
      default: System.out.println("\nThe points you entered are invalid.");
               break;
      }
    }
}
