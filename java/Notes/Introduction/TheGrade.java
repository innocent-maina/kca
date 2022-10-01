import java.io.*;

class TheGrade
{
   public static void main(String args[])
   {
      try
      {
         char grade;

         System.out.print("\nEnter the grade the student scored:> ");
         grade = (char)System.in.read();

         System.out.println("\nThe student scored grade " + grade);
      }
      catch(IOException e){}
   }
}
