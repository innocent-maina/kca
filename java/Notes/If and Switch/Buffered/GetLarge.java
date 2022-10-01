import java.io.*;

class GetLarge
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int a,b,large;

         System.out.println("\nEnter two numbers:> ");
         a = Integer.parseInt(s.readLine());
         b = Integer.parseInt(s.readLine());

         if(a > b)
            large = a;
         else
            large = b;

         System.out.println("\nBetween " + a + " and " + b + " the largest is " + large);
      }
      catch(IOException e){}
   }
}
