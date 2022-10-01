import java.util.Scanner;

class StudentDetails
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String name, course, place;

      System.out.print("\nEnter your are name: ");
      name = myScanner.nextLine();
      System.out.print("Enter the course you are doing: ");
      course = myScanner.nextLine();
      System.out.print("Where are you from? ");
      place = myScanner.nextLine();

      System.out.println("\nYou are " + name + " from " + place + " and you are doing " + course);
   }
}
