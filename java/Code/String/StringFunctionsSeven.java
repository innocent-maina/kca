import java.util.Scanner;

class StringFunctionsSeven
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);

      String sentence = "We are going to Mombasa to buy a car to give the class rep";
      String[] one; //The split method to be used returns an array of strings.
      String[] two;
      int i;

      System.out.print("\nThe sentence is : " + sentence);
      
      one = sentence.split("to"); //Sentence to be split everywhere the word to appears
      two = sentence.split(" ");//Sentence to be split everywhere there is a space (" ").
      
      System.out.println("\nAfter splitting everywhere the word to appears:\n");
      for(i = 0;i < one.length; i++)
         System.out.println(one[i]);

      System.out.println("\nAfter splitting everywhere there is a space:\n");
      for(i = 0;i < two.length; i++)
         System.out.println(two[i]);
   }
}
