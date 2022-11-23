import java.util.Scanner;

class StringFunctionsEight
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);

      String sentence = "We are going to Mombasa to buy a car to give the class rep";
      String[] one; //The split method to be used returns an array of strings.
      String[] two;
      int i;

      System.out.print("\nThe sentence is : " + sentence);
      
      one = sentence.split("to",3); //Sentence to be split everywhere the word to appears. Limits splits to 3
      two = sentence.split(" ",5);//Sentence to be split everywhere there is a space (" ").  Limits splits to 5
      
      System.out.println("\nAfter splitting everywhere the word to appears:\n");
      for(i = 0;i < one.length; i++)
         System.out.println(one[i]);

      System.out.println("\nAfter splitting everywhere there is a space:\n");
      for(i = 0;i < two.length; i++)
         System.out.println(two[i]);
   }
}
