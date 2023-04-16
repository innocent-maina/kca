#include <stdio.h>

int main()
{
  // declare the integers to do the calculation
  int num1, num2, sum;
  // declare the pointers to the integers
  int *ptr1, *ptr2;

  // prompt the user for the first number
  printf("Enter the first number: ");
  scanf("%d", &num1);

  // prompt the user for the second number
  printf("Enter the second number: ");
  scanf("%d", &num2);

  // assign the addresses of the integers to the pointers
  ptr1 = &num1;
  ptr2 = &num2;

  // calculate the sum
  sum = *ptr1 + *ptr2;

  // print the sum
  printf("The sum of %d and %d is %d\n", *ptr1, *ptr2, sum);

  return 0;
}
