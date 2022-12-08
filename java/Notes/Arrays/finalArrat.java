import java.util.*;

public class finalArrat{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double[] numbers;
        double sum = 0;
        double average, largest, smallest;
        int all, i;

        System.out.println("How many numbners do you want to work with?");
        all = myScanner.nextInt();

        numbers = new double[all];

        for(i = 0; i < all; i++) {
            numbers[i] = myScanner.nextDouble();
            sum = sum + numbers[i];
        }

        System.out.println("The numbers you entered were ");
        for(i = 0; i < all; i++) {
            System.out.println(numbers[i]);
        }


        Arrays.sort(numbers);


        largest = numbers[1];
        smallest = numbers[0];

        average = sum / all;


        System.out.println("Average " + average);
        System.out.println("sum " + sum);
        System.out.println("largest " + largest);
        System.out.println("smallest " + smallest);

    }
}