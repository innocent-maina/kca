import java.io.*;

class Largest
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int a,b,c,largest;

         System.out.println("\nEnter three numbers: ");
         a = Integer.parseInt(s.readLine());
         b = Integer.parseInt(s.readLine());
         c = Integer.parseInt(s.readLine());

         if(a > b && a > c)
            largest = a;
         else if(b > a && b > c)
            largest = b;
         else
            largest = c;

         System.out.println("\nBetween " + a + ", " + b + " and " + c + " the largest is " + largest);
      }
      catch(IOException e){}
   }
}
