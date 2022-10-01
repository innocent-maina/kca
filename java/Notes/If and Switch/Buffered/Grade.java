import java.io.*;

class Grade
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         double subj1, subj2, subj3, average;
         char grade;

         System.out.println("\nEnter marks in three subjects: ");
         subj1 = Double.parseDouble(s.readLine());
         subj2 = Double.parseDouble(s.readLine());
         subj3 = Double.parseDouble(s.readLine());

         average = (subj1 + subj2 + subj3) / 3.0;

         if(average >= 70 && average <= 100)
            grade = 'A';
         else if(average >= 60 && average < 70)
            grade = 'B';
         else if(average >= 50 && average < 60)
            grade = 'C';
         else if(average >= 40 && average <= 50)
            grade = 'D';
         else
            grade = 'E';


         System.out.println("\nThe average mark is " + average);
         System.out.println("\nThe grade obtained is " + grade);
      }
      catch(IOException e){}
   }
}
