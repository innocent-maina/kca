import java.util.Scanner;

class Triangle
{
   private double base, height, hypotenuse;
   private double area, perimeter;

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the base of the triangle: ");
      base = myScanner.nextDouble();
      System.out.print("Enter the height of the triangle: ");
      height = myScanner.nextDouble();
   }

   public void calculate()
   {
      area = 1.0/2 * base * height;
      hypotenuse = Math.sqrt(Math.pow(base,2) +  Math.pow(height,2));
      perimeter = base + height + hypotenuse;
   }

   public void output()
   {
      System.out.println("Base = " + base + "\nHeight = " + height);
      System.out.println("Area = " + area);
      System.out.println("Perimeter = " + perimeter);
   }
}