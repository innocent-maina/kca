import java.util.Scanner;

class LargestNumBest
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int a,b,c,largest;

      System.out.println("\nEnter three numbers: ");
      a = myScanner.nextInt();
      b = myScanner.nextInt();
      c = myScanner.nextInt();

      if(a > b)
         largest = a;
      else
         largest = b;
         
      if(c > largest)
         largest = c;

      System.out.println("\nBetween " + a + ", " + b + " and " + c + " the largest is " + largest);
    }
}
