/*This program computes the sum
of all even numbers between 1 and 100*/

class DoSumEven100
{
   public static void main(String args[])
   {
      int h, sum = 0;

      h = 1;

      do
      {
         if(h % 2 == 0)
            sum = sum + h;
	 h = h + 1;
      }while(h <= 100);

      System.out.println("\nThe sum of all numbers between 1 and 100 is " + sum);
   }
}