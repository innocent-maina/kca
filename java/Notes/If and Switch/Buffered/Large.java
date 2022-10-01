import java.io.*;

class Large
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int a,b;

         System.out.println("Enter two numbers:> ");
         a = Integer.parseInt(s.readLine());
         b = Integer.parseInt(s.readLine());

         if(a > b)
            System.out.println(a + " is larger than " + b);
         else
            System.out.println(b + " is larger than " + a);
      }
      catch(IOException e){}
   }
}
