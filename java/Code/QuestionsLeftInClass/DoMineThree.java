public class DoMineThree {
  public static void main (String[] args) {
    int k;
    k = 1000000;
    do {
      System.out.println(k);
      k = k / 10;

    } while (k >= 100);
  }
}
