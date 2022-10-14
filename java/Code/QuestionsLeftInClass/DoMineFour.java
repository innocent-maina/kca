public class DoMineFour {
  public static void main (String[] args) {
    int i;
    int numberOfTerms;
    numberOfTerms = 1;
    i = 2;
    do {
      System.out.println(i);
      i = i * 3;
      numberOfTerms = numberOfTerms + 1;
    } while (numberOfTerms <= 20);
  }
}
