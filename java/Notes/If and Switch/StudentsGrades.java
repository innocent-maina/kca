import java.util.Scanner;

class StudentsGrades
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double subj1, subj2, subj3, average;
      char grade;

      System.out.println("\nEnter marks in three subjects: ");
      subj1 = myScanner.nextDouble();
      subj2 = myScanner.nextDouble();
      subj3 = myScanner.nextDouble();

      average = (subj1 + subj2 + subj3) / 3.0;
      
      System.out.println("\nThe average mark is " + average);

      if(average >= 70)
         System.out.println("\nThe grade obtained is A");
      else if(average >= 60)
         System.out.println("\nThe grade obtained is B");
      else if(average >= 50)
         System.out.println("\nThe grade obtained is C");
      else if(average >= 40)
         System.out.println("\nThe grade obtained is D");
      else if(average >= 0)
         System.out.println("\nThe grade obtained is E");

   }
}
