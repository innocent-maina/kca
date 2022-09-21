//     4) The value of y is calculated as follows:-
// y = 4x3 + 2x – 6                       when x > 5
// y = 3x2 – 4y + 12                     when x < 5
// y = 6x – 5                                 when x = 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        int x = scanner.nextInt();
        int y;
        if (x > 5) {
            y = 4 * x * x * x + 2 * x - 6;
        } else if (x < 5) {
            y = 3 * x * x - 4 * y + 12;
        } else {
            y = 6 * x - 5;
        }
        System.out.println("y = " + y);
    }
}
