import java.util.Scanner;


class WekaRadius
{
   private int radius;

   public int getRadius()
   {
      return radius;
   }

   public void setRadius(int r)
   {
      radius = r;
   }
}

class CicrleConstructor
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);

      WekaRadius m1 = new WekaRadius();
      WekaRadius m2 = new WekaRadius();
      int radius1, radius2;

      m1.setRadius(23);

      System.out.print("\nEnter the radius for the second circle:> ");
      radius2 = myScanner.nextInt();
      m2.setRadius(radius2);

      radius1 = m1.getRadius();

      System.out.println("\nThe first circle is " + radius1 + " cm.");
      System.out.println("The second circle  is " + m2.getRadius() + " years old.");
   }
}

