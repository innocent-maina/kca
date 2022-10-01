import javax.swing.JOptionPane;

class DialogAppTwo
{
   public static void main(String[] args)
   {
      int age;

      age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

      System.out.println("\nYou are " + age + " years old.");
   }
}