import java.util.Scanner;

class Age
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int age;

      System.out.print("\nEnter your age:> ");
      age = myScanner.nextInt();

      System.out.println("\nYou are " + age + " years old.\n");
   }
}
