import java.util.Scanner;

class AwardSwitchTwo
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int points;

      System.out.print("\nEnter the points the student scored:> ");
      points = myScanner.nextInt();

      switch(points)
      {
      case 4:
      case 3: 
      case 2: System.out.println("\nThe student Passed.");
              break;
      case 1: System.out.println("\nThe student Failed.");
              break;
      default: System.out.println("\nThe points you entered are invalid.");
              break;
      }
   }
}