/*This program computes the sum
of all even numbers between 1 and 100*/

class DoSumEven100
{
   public static void main(String args[])
   {
      int k = 1;
      int sum = 0;

      do
      {
         if(k % 2 == 0) {
            sum = sum + k;
         }
	    k = k + 1;
      }while(k <= 100);

      System.out.println("\nThe sum of all numbers between 1 and 100 is " + sum);
   }
}
