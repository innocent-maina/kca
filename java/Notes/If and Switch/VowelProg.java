import java.util.Scanner;

class VowelProg
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      char lett;

      System.out.print("\nEnter a character: ");
      lett = myScanner.findInLine(".").charAt(0);

      switch(lett)
      {
      case 'a': 
      case 'e': 
      case 'i': 
      case 'o': 
      case 'u':System.out.println("\n" + lett + " is a vowel.");
               break;
      default: System.out.println("\n" + lett + " is not a vowel.");
               break;
      }
   }
}
