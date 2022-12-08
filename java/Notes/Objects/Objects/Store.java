public class Store {
    public static void main(String[] args)
    {
        int i,j;
        // int[][] items = new int[3][4]
        int[][] items = {{109, 2000, 500, 4}, {201, 800, 100, 8}, {127, 500, 50, 10}};

        System.out.println("Item code       Total cost          Code            New");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 4; j++)
            {
                System.out.print(items[i][j] + " ");
            }
            System.out.println();
        }
    }   
}