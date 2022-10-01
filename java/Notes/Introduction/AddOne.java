import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class AddOne
{
   public static void main(String args[])
   {
   try
   {
      BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
      double a, b, c, sum, prod, avg;

      System.out.println("\nEnter three numbers: ");
      a = Double.parseDouble(s.readLine());
      b = Double.parseDouble(s.readLine());
      c = Double.parseDouble(s.readLine());

      sum = a + b + c;
      prod = a * b * c;
      avg = sum / 3;

      System.out.println("\nThe sum of the numbers is " + sum);
      System.out.println("Their product is " + prod);
      System.out.println("Their average is " + avg);
   }
   catch(IOException e){}
   }
}
