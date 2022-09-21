#include <stdio.h>

int salary;
int tax;
int netSalary;

int main()
{

  printf("Enter the salary\n");
  scanf("%d", &salary);


  if (salary >= 20000) {
    tax = salary * 0.15;
  } else if (salary > 10000 && salary < 19999) {
    tax = salary * 0.10;
  } else if (salary > 0 && salary <= 9999){
    tax = 0;
  }

  netSalary = salary - tax;

  printf("Tax amount = %d\n", tax);
  printf("NetSalary = %d\n", netSalary);
  return 0;
}
