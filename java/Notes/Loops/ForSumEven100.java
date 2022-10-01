/*This program computes the sum of 
all even numbers between 1 and 100*/

class ForSumEven100
{
   public static void main(String args[])
   {
      int i, sum = 0;

      for(i = 1;i <= 100;i++)
         if(i % 2 == 0)
            sum = sum + i;

      System.out.println("\nThe sum of all even numbers between 1 and 100 is " + sum);
   }
}