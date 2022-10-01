import java.io.*;

class AwardPoints
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
      catch(IOException e){}
   }
}
