#include <stdio.h>

int marks;
int main()
{

  printf("Enter a marks\n");
  scanf("%d", &marks);

  if (marks % 9 == 0 && marks % 2 == 0)
  {
    printf("The marks is evenly divisible by 9\n");
  }
  else
  {
    printf("The marks is not evenly divisible by 9\n");
  }
  return 0;
}
