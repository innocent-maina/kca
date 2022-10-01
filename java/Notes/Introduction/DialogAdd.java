import javax.swing.JOptionPane;

class DialogAdd
{
   public static void main(String[] args)
   {
      String s;
      double num1, num2, sum;

      s = JOptionPane.showInputDialog("Enter the first number:");
      num1 = Integer.parseInt(s);
    
      s = JOptionPane.showInputDialog("Enter the second number:");
      num2 = Integer.parseInt(s);

      sum = num1 + num2;

      System.out.println("\nThe sum of " + num1 + " and " + num2 + " is " + sum);
   }
}