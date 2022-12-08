// Write a program that accepts a set of numbers (The user decides how many) and stores them in array. The program should the sort all the numbers in the array in ascending order. It should output the numbers in the array before sorting and then again after sorting.   

import java.util.Scanner;

public class Ten {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int i, j, temp;
        int[] numbers = new int[5];

        System.out.print("How many numbers do you want to enter? ");
        numbers = new int[myScanner.nextInt()];
        System.out.println("Enter " + numbers.length + " numbers: ");

        for(i = 0;i < numbers.length;i++)
        {
           numbers[i] = myScanner.nextInt();
        }

        System.out.println("The numbers before sorting ");
        for(i = 0;i < numbers.length;i++){
          System.out.print(numbers[i] + " ");
        }

        for(i = 0;i < numbers.length;i++)
        {
            for(j = i + 1;j < numbers.length;j++)
            {
                if(numbers[i] > numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("\nThe numbers after sorting: ");
        for(i = 0;i < numbers.length;i++){
          System.out.print(numbers[i] + " ");
        }

    }
}