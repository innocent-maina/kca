//     12) Write a program that prints God bless Kenya. 25 times on the screen using: -
       // a) do…while loop.
       // b) while… loop
       // c) for… loop.
  //The Phrase God Bless Kenya should appear only once in your source code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("God bless Kenya");
            i++;
        } while (i < 25);
        int j = 0;
        while (j < 25) {
            System.out.println("God bless Kenya");
            j++;
        }
        for (int k = 0; k < 25; k++) {
            System.out.println("God bless Kenya");
        }
    }
}
