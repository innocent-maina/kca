class DoFour
{
   public static void main(String args[])
   {
      int k;

      k = 600;

      do
      {
         System.out.println("k = " + k);
	 k = k / 2;
      }while(k >= 10);
   }
}