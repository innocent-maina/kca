import java.util.Scanner;

class Add
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double a, b, c, sum, prod, avg;

      System.out.println("\nEnter three numbers: ");
      a = myScanner.nextDouble();
      b = myScanner.nextDouble();
      c = myScanner.nextDouble();

      sum = a + b + c;
      prod = a * b * c;
      avg = sum / 3;

      System.out.println("\nThe sum of the numbers is " + sum);
      System.out.println("Their product is " + prod);
      System.out.println("Their average is " + avg);
   }
}
