import java.io.*;

class GetGrade
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

         if(average >= 70)
            grade = 'A';
         else if(average >= 60)
            grade = 'B';
         else if(average >= 50)
            grade = 'C';
         else if(average >= 40)
            grade = 'D';
         else
            grade = 'E';


         System.out.println("\nThe average mark is " + average);
         System.out.println("\nThe grade obtained is " + grade);
      }
      catch(IOException e){}
   }
}
