/*Program to print all numbers divisible by 6
between 400 and 600*/

class ForDiv6
{
   public static void main(String args[])
   {
      int h;

      System.out.println("\nThe numbers divisible by 6 between 400 and 600 are:\n");

      for(h = 100;h <= 400;h++)
         if(h % 6 == 0)
            System.out.print(h + " ");
   }
}