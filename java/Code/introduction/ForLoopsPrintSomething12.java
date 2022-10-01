//     12) Write a program that prints God bless Kenya. 25 times on the screen using: -
       // a) do…while loop.
       // b) while… loop
       // c) for… loop.
  //The Phrase God Bless Kenya should appear only once in your source code.

import java.util.Scanner;

public class ForLoopsPrintSomething12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("God bless Kenya");
            i++;
        } while (i <= 25);
        int j = 1;
        while (j <= 25) {
            System.out.println("God bless Kenya");
            j++;
        }
        for (int k = 1; k <= 25; k++) {
            System.out.println("God bless Kenya");
        }
    }
}
