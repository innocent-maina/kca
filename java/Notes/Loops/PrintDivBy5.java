//Program to print all numbers
//divisible by 5 between 100 and 200

class PrintDivBy5
{
   public static void main(String args[])
   {
      int p;

      System.out.println("\nThe numbers divisible by 5 between 100 and 200 are:\n");

      p = 100;

      do
      {
         if(p % 5 == 0)
            System.out.print(p + " ");
	 p = p + 1;
      }while(p <= 200);
   }
}