import java.util.Scanner;

class StringFunctionsOne
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String str1 = "", str2 = "Kenya", str3;
      int len1, len2;

      System.out.println("\nThe first string is an empty sring " + str1.isEmpty()); //checking empty string i.e. ""
      System.out.println("The second string is an empty sring " + str2.isEmpty());

      System.out.print("\nEnter the first string: ");
      str1 = myScanner.nextLine();
      System.out.print("Enter the second string: ");
      str2 = myScanner.nextLine();

      len1 = str1.length(); //Getting length of the string 
      len2 = str2.length();   

      str3 = str1.concat(str2); //Concatanating strings

      System.out.println("\nThe length of the string " + str1 + " is " + len1 + " and the string " + str2 + " is " + len2);
      System.out.println("\nThe third string is " + str3);
   }
}
