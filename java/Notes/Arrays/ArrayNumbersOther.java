import java.io.*;

class ArrayNum3
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         int[] numbers = new int[10];
         int i;

         for(i = 0;i < 10;i++)
         {
            System.out.println("Enter element " + (i + 1));
            numbers[i] = Integer.parseInt(s.readLine());
         }
         System.out.println("The values you entered were:-");
         for(i = 0;i < 10;i++)
            System.out.println(numbers[i]);
      }
      catch(IOException e){}
   }
}
