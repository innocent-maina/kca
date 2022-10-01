/*This program computes the sum
of all numbers between 1 and 100*/

class WhileSum100
{
   public static void main(String args[])
   {
      int k,sum = 0;

      k = 1;

      while(k <= 100)
      {
         sum = sum + k;
	 k = k + 1;
      }

      System.out.println("\nThe sum of all numbers between 1 and 100 is " + sum);
   }
}