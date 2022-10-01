//Program to print all numbers
//divisible by 8 between 1 and 200

class PrintDivBy8
{
   public static void main(String args[])
   {
      int k;

      System.out.println("\nThe numbers divisible by 8 between 1 and 200 are:\n");

      k = 1;

      do
      {
         if(k % 8 == 0)
            System.out.print(k + " ");
	 k = k + 1;
      }while(k <= 200);
   }
}