import java.util.Scanner;

class StringFunctionsFive
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      String jina1, jina2, jina3, fullName;

      System.out.print("\nEnter your first name: ");
      jina1 = myScanner.nextLine();
      System.out.print("Enter your middle name: ");
      jina2 = myScanner.nextLine();
      System.out.print("Enter your surname: ");
      jina3 = myScanner.nextLine();

      //join() combines a number of strings. The first parameter [" " in this case]
      //specifies the delimeter between the strings
      fullName = String.join(" ", jina1, jina2, jina3);
      //to use join(), you must be on jdk 1.8 and above

      System.out.println("\nYour name is " + fullName);

      String resolution = String.join(" -> ", "Lift heavy weights", "Eat", "Sleep", "Repeat");
  
      System.out.println(resolution);
   }
}
