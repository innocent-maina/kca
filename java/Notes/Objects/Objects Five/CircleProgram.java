class CircleProgram
{
   public static void main(String args[])
   {
      CicrleConstructor circ1 = new CicrleConstructor();
      CicrleConstructor circ2 = new CicrleConstructor();

      System.out.println("\nData entry for circle 1:");
      System.out.println("-----------------------------------------");
      circ1.getRadius();

      System.out.println("\nData entry for circle 2:");
      System.out.println("-----------------------------------------");
      circ2.getRadius();

      System.out.println("\nOutput for circle 1:");
      System.out.println("-----------------------------------------");
      circ1.giveOutput();

      System.out.println("\nOutput for circle 2:");
      System.out.println("-----------------------------------------");
      circ2.giveOutput();
   }
}
