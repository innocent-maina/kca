import java.util.Scanner;

class StringFunctionsFour
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String str1 = "Maina";
      String str2 = "Fantabulous";
      
      System.out.println("\nThe string is: " + str1 + "\nThe first letter is " + str1.charAt(0) + "\nThe third is " + str1.charAt(2));

      //Getting a substring starting at a certain point (index) to the end.
      System.out.println("\nThe original string: " + str2 + "\nFrom the fourth character onwards: " + str2.substring(3));
      System.out.println("From the first to fifth character: " + str2.substring(0,5));//Getting a substring between two points (index)

      System.out.println("\nThe index of the character 'n' in " + str1 + " is " + str1.indexOf('n')); //Getting the index of a given character.

      //contains() checks whether a string contains a certain sequence of characters.
      System.out.println("\n" + str2 + " has the string 'tabul' somewhere -> " + str2.contains("tabul"));
      System.out.println(str2 + " has the string 'fast' somewhere -> " + str2.contains("fast"));
   }
}
