import java.io.*;

class Details
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         String name, course, place;

         System.out.print("\nEnter your are name: ");
         name = s.readLine();
         System.out.print("Enter the course you are doing: ");
         course = s.readLine();
         System.out.print("Where are you from? ");
         place = s.readLine();

         System.out.println("\nYou are " + name + " from " + place + " and you are doing " + course);
      }
      catch(IOException e){}
   }
}
