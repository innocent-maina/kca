import javax.swing.JOptionPane;

class Triangle
{
   public static void main(String args[])
   {
      double base, height, area;

      base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle:"));
      height = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle:"));

      area = 1.0/2 * base * height;

      System.out.println("\nThe area of the triangle is " + area);
   }
}