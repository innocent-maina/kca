import java.util.Scanner;

class StringFunctionsThree
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String str1 = "Maina";
      String str2 = "MAINA";
      String str3 = "John";

      //equals() compares two strings. It is case sensitive.
      System.out.println(str3 + " and " + str2 + " are the same -> " + str3.equals(str2));
      System.out.println(str1 + " and " + str2 + " are the same (case sensitive) -> " + str1.equals(str2));

      //equalsIgnoreCase() compares two strings. It is NOT case sensitive.
      System.out.println(str1 + " and " + str2 + " are the same (not case sensitive) -> " + str1.equalsIgnoreCase(str2));
   }
}
