/*This program computes the sum of 
all numbers between 1 and 100*/

class ForSum100
{
   public static void main(String args[])
   {
      int h;
      
      int i, sum = 0;
      for(i = 1;i <= 100;i++)
         sum = sum + i;

      System.out.println("\nThe sum of all numbers between 1 and 100 is " + sum);
   }
}