/*This program computes the sum
of all numbers between 1 and 100*/

class DoSum100
{
   public static void main(String args[])
   {
      int k, sum = 0;

      k = 1;

      do
      {
         sum = sum + k;
	 k = k + 1;
      }while(k <= 100);

      System.out.println("\nThe sum of all numbers between 1 and 100 is " + sum);
   }
}