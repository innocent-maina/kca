import java.io.*;

class AwardPointsTwo
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int points;

         System.out.print("\nEnter the points the student scored:> ");
         points = Integer.parseInt(s.readLine());

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
      catch(IOException e){}
   }
}
