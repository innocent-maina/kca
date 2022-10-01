import javax.swing.JOptionPane;

class DialogAppOne
{
   public static void main(String[] args)
   {
      String s;
      int age;

      s = JOptionPane.showInputDialog("Enter your age:");
      age = Integer.parseInt(s);

      System.out.println("\nYou are " + age + " years old.");
   }
}