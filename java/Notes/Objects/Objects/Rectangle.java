import java.util.Scanner;

class Rectangle
{
   protected double width,length,area;

   public void data_in()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the width: ");
      width = myScanner.nextDouble();
      System.out.print("Enter the length: ");
      length = myScanner.nextDouble();
   }

   public void data_calculate()
   {
      area = width * length;
   }

   public void data_out()
   {
      System.out.println("The area of the rectangle is " + area);
   }
}