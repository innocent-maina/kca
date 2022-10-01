import java.io.*;

class OR
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         double marks;

         System.out.print("\nEnter marks the student scored: ");
         marks = Double.parseDouble(s.readLine());
        
         if(marks < 0 || marks > 100)
            System.out.println(marks + " is a INVALID mark.\n");
         else
            System.out.println(marks + " is an VALID mark.\n");
      }
      catch(IOException e){}
   }
}
