import java.io.*;

class Factorial
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int i,num, fact = 1;

         System.out.print("\nEnter an integr to find factorial: ");
         num = Integer.parseInt(s.readLine());

         for(i= 1;i <= num;i++)
	    fact = fact * i;
         System.out.println("\nThe factorial of " + num + " is " + fact);
      }
      catch(IOException e){}
   }
}
