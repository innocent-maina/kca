public class EvenSimpleMultidimensional
{
    public static void main(String[] args)
    {
        int i, j;
        int sum = 0;
        int average = 0;
        int[][] spotify = {{12, 34, 56, 56, 45, 34}, {43, 67, 76, 56, 34, 78}, {21, 45, 21, 44, 45, 69}};

        // 3 columns of 6 rows

        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 6; j++)
            {
                System.out.print(spotify[i][j] + "  ");
                sum = sum + spotify[i][j];
            }
            System.out.println();
        }

        average = sum / 18; 


        System.out.println("\n\nThe sum of all elements is " + sum);
        System.out.println("The average of all elements is " + average);
    }
}