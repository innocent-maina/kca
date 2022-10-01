import java.util.Scanner;

class Circle
{
   private double radius, area, circum;

   public void getData()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the radius of the triangle: ");
      radius = myScanner.nextDouble();
   }

   public void compute()
   {
      final double PI = 22.0/7;

      area = PI * radius * radius;
      circum = 2 * PI * radius;
   }

   public void giveOutput()
   {
      System.out.println("Radius of the circle = " + radius);
      System.out.println("Area = " + area);
      System.out.println("Circumference = " + circum);
   }
}