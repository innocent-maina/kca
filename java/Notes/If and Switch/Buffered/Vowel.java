import java.io.*;

class Vowel
{
   public static void main(String args[])
   {
      try   
      {
         char lett;
         System.out.println("\nEnter a character:");
         lett = (char)System.in.read();
         switch(lett)
         {
         case 'a': 
         case 'e': 
         case 'i': 
         case 'o': 
         case 'u':System.out.println(lett + " is a vowel.");
                  break;
         default: System.out.println(lett + " is not a vowel.");
                  break;
         }
      }
      catch(IOException e){}
   }
}
