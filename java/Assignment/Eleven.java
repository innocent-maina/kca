import java.util.Scanner;

public class Eleven {
    public static int a, b;
    public static void swapNumbers()
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("\nEnter two integers: ");
        a = myScanner.nextInt();
        b = myScanner.nextInt();

        System.out.println("Before swapping: " + a + " and before swapping a " + b);
        swapNumbers();
        System.out.println("After swapping: " + a + " and after swapping b " + b);
    }


}
