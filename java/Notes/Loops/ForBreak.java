class ForBreak
{
   public static void main(String args[])
   {
      int i;

      for(i = 1;i <= 10;i++)
      {
         if(i == 6)
	 {
	    System.out.println("\nThis is my favourite number.\n");
	    break;
	 }
	 System.out.println("i = " + i);
      }
   }
}