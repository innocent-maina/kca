class ReadingExample 
{
   public static void main(String args[]) 
   {
      java.util.Scanner myScanner = new java.util.Scanner(System.in);
      String name;

      System.out.print("\nEnter your name: ");
      name = myScanner.nextLine();

      System.out.println("Your name is " + name);
   }
}
