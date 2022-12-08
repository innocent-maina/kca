public class SimpleMultiDimensional
{
    public static void main(String[] args)
    {
        int[][] data = {{8,7,4,5},{6,3,8,9},{8,2,6,9}};
        int i, j;
        int sum = 0;
        double average;

        // 5 columns of 4 rows each

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