import java.util.Scanner;

class VotingTwoMine
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int age;

      System.out.print("\nEnter your age:> ");
      age = myScanner.nextInt();

      if(age >= 18)
         {
            System.out.print("\nYou can vote");
            System.out.print("\nPlease vote wisely");
         }
      else
         {
           System.out.print("\nYou are too young to vote");
           System.out.print("\nDon't worry");
         }

   }
}
