public class MyDoSum100 {
  public static void main(String[] args) {
    int k = 1;
    int sum = 0;
    do {
      k = k + 1;
      sum = sum + k;
    } while (k <= 100);
     System.out.println(sum);
  }
}
