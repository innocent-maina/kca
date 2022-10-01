import java.io.*;

class MyRectangle
{
   public static void main(String args[])
   {
      try
      {
         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
         double width,length,area,perim;

         System.out.print("\nEnter the width of the rectangle:> ");
         width = Double.parseDouble(s.readLine());
         System.out.print("Enter the length of the rectangle:> ");
         length = Double.parseDouble(s.readLine());

         area = length * width;
         perim = 2 * (length + width);

         System.out.println("\nThe area of the rectangle is " + area);
         System.out.println("The perimeter of the rectangle is " + perim);
      }
      catch(IOException e){}
   }
}
