#include <stdio.h>

int number;
int main()
{

  printf("Enter a number\n");
  scanf("%d", &number);

  if (number > 0)
  {
    printf("The number is positive\n");
  }
  else if (number < 0)
  {
    printf("The number is negative\n");
  }
  else
  {
    printf("The number is zero\n");
  }
  return 0;
}
