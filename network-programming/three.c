#include <stdio.h>

// function prototype
// this function takes three pointers as arguments
// the first two pointers point to the numbers to add
// the third pointer points to the variable to store the result
// the function does not return a value
void add_numbers(int *ptr1, int *ptr2, int *result)
{
  *result = *ptr1 + *ptr2;
}

// main function
int main()
{
  // declare the integers to do the calculation
  int num1, num2, sum;

  // prompt the user for the first number
  printf("Enter the first number: ");
  scanf("%d", &num1);

  // prompt the user for the second number
  printf("Enter the second number: ");
  scanf("%d", &num2);

  // call the function to add the numbers
  // pass the addresses of the integers as arguments
  add_numbers(&num1, &num2, &sum);

  // print the sum
  printf("The sum of %d and %d is %d\n", num1, num2, sum);

  return 0;
}
