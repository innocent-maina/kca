public class doSum {
  public static void main(String args[]) {
    // initialization
    int k = 1;
    int sum = 0;
    do {
      k = k + 1;
      sum = sum + k;
    } while (k <= 100);
      System.out.println("The sum is " + sum);
  }
}
