import java.util.Scanner;

class AwardSwitch
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int points;

      System.out.print("\nEnter the points the student scored:> ");
      points = myScanner.nextInt();

      switch(points)
      {
      case 4: System.out.println("\nThe student got a Distinction.");
              break;
      case 3: System.out.println("\nThe student got a Credit.");
              break;
      case 2: System.out.println("\nThe student got a Pass.");
              break;
      case 1: System.out.println("\nThe student got a Fail.");
              break;
      default: System.out.println("\nThe points you entered are invalid.");
              break;
      }
   }
}
