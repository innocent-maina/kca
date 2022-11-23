import java.util.Scanner;

class StringFunctionsTwo
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String str1 = "       Good Morning     ";
      String str2 = "Kenya";
      String str3 = "Baba", str4 = "I enjoy music", str5, str6;
      
      System.out.println("\nBegin" + str1 + "End");
      System.out.println("Begin" + str1.trim() + "End\n");//trim( ) gets rid of spaces before and after the string
      System.out.println(str2.toUpperCase()); //converting to upper case
      System.out.println(str2.toLowerCase()); //converting to lower case
    
      str5 = str3.replace('a','i');//replacing characters.

      System.out.println("\nBefore replacing: " + str3);
      System.out.println("After replacing: " + str5);

      str6 = str4.replace("enjoy","love");//replacing a sequence characters.

      System.out.println("\nBefore replacing: " + str4);
      System.out.println("After replacing: " + str6);
   }
}
