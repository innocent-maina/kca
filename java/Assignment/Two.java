import java.util.Scanner;
public class Two {

public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    int i = 0;
    int j = 0;

    for(i = 8; i > 0; i--) {
        for(j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
  }
}

