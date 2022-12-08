// Write a program that accepts a list of integers and computes their sum. The program should allow the user to enter any number of integers but an input of zero should terminate the list. /For example if the user enters 2 5 6 12 8 2 0 the sum should be 35. If he/she enters 2 4 5 0 the sum should be 11 and if he enters 5 4 6 0 12 43 2 the sum should 15 i.e. only numbers before zero are summed. The rest are ignored and the program terminated. 

import java.util.Scanner;

public class One {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        int i;

        // create an array and the user to decide how many characters to enter
        System.out.print("How many numbers do you want to enter? ");
        int[] numbers = new int[myScanner.nextInt()];
        System.out.println("Enter " + numbers.length + " numbers: ");

        // get data
        for(i = 0;i < numbers.length;i++)
        {
           numbers[i] = myScanner.nextInt();
        // calculate the sum of the numbers entered  only numbers before zero are summed
              if(numbers[i] == 0) {
                  break;
              }
              sum = sum + numbers[i];
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}