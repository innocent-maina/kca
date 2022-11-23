public class MyDoSumEven100 {
   public static void main(String args[]) {
    int k = 1;
    int sum = 100;

    do {
      if (k % 2 == 0) {
        sum = sum + k;
      }
      k = k + 1;
    } while (k <= 100);
    System.out.println("The sum is " + sum);
  }
}
