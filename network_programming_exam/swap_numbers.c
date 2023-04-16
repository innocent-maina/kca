// A pointer that swaps the values of 2 integers

#include <stdio.h>

int num1;
int num2;

void swap(int *x, int *y)
{
  int temp = *x;
  *x = *y;
  *y = temp;
}

int main()
{

  printf("Enter the first number to be swapped");
  scanf("%d", &num1);
  printf("Enter the second number to be swapped");
  scanf("%d", &num2);

  printf("Numbers before swapping, num1 = %d, num2 = %d", num1, num2);
  swap(&num1, &num2);
  printf("Numbers after swapping, num1 = %d, num2 = %d", num1, num2);

  return 0;
}
