class DiffDo {

  public static void main(String args[]) {
    int k;
    k = 100;

    {
      System.out.println("\nk = " + k);
      k = k + 1;
    }
    while (k <= 20);

    System.out.println("\nGoodbye.\n");
  }
}
