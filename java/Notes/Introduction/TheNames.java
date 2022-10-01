import javax.swing.JOptionPane;

class TheNames
{
   public static void main(String args[])
   {
      String name;

      name = JOptionPane.showInputDialog("Enter your name:");

      System.out.println("\nYour name is " + name);
   }
}