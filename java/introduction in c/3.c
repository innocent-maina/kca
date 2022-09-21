#include <stdio.h>

int gender;
int earning;
int tax;

int main()
{

  printf("Enter the gender \"0 for female\" or \"1 for male\"\n");
  scanf("%d", &gender);
  printf("Enter the earning \n");
  scanf("%d", &earning);

  if (gender == 0)
  {
    if (earning < 15000)
    {
      tax = earning * 0.12;
      printf("The tax total is %d\n", tax);
    }
    else if (earning >= 15000)
    {
      tax = earning * 0.14;
      printf("The tax total is %d\n", tax);
    }
  }
  else if (gender == 1)
  {
    if (earning < 14000)
    {
      tax = earning * 0.13;
      printf("The tax total is %d", tax);
    }
    else if (earning >= 14000)
    {
      tax = earning * 0.15;
      printf("The tax total is %d", tax);
    }
  }

  return 0;
}
