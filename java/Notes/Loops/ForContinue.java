class ForContinue
{
   public static void main(String args[])
   {
      int i;

      for(i = 1;i <= 10;i++)
      {
         if(i == 6)
	 {
	    System.out.println("\nThis is my favourite number.\n");
	    continue;
	 }
	 System.out.println("i = " + i);
      }
   }
}