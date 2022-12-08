public class PrintNumbersOnly {
    public static void main(String[] args)
    {
        int i;
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println("The numbers here are: ->");
        for(i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
