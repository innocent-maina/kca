import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int i, j;
        int sum = 0;
        int[][] data = new int[3][4];

        // get data
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 4; j++)
            {
                System.out.print("Enter element (" + (i + 1) + "," + (j + 1) + ") ->");
                data[i][j] = myScanner.nextInt();
                sum = sum + data[i][j];
            }
        }

        // display data
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 4; j++)
            {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
