#include <stdio.h>

// function prototype
// this function takes two pointers as arguments
// the function returns the maximum value between the two numbers
// the function does not modify the values of the numbers
int find_max(int *ptr1, int *ptr2)
{
  if (*ptr1 > *ptr2)
  {
    return *ptr1;
  }
  else
  {
    return *ptr2;
  }
}

// main function
int main()
{
  // declare the integers to do the calculation
  int num1, num2;
  // declare the pointers to the integers
  int *ptr1, *ptr2;

  // prompt the user for the first number
  printf("Enter the first number: ");
  scanf("%d", &num1);

  // prompt the user for the second number
  printf("Enter the second number: ");
  scanf("%d", &num2);

  // assign the addresses of the integers to the pointers
  // the addresses of the integers are stored in the pointers
  ptr1 = &num1;
  ptr2 = &num2;

  // call the function to find the maximum number
  int max = find_max(ptr1, ptr2);

  // print the maximum number
  printf("The maximum number between %d and %d is %d\n", *ptr1, *ptr2, max);

  return 0;
}
