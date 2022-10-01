import java.io.*;

class GetAge
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int age;

         System.out.print("\nEnter your age:> ");
         age = Integer.parseInt(s.readLine());

         System.out.println("\nYou are " + age + " years old.\n");
      }
      catch(IOException e){}
   }
}
