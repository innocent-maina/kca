#include <stdio.h>

int main()
{
  // declare the integers
  // one to hold the value of the number
  // one to hold the address of the number
  int num = 42; // num stores the value 42
  int *ptr = &num; // ptr stores the address of num

  // print the values and addresses of the number
  printf("The value of num is %d\n", num);
  printf("The address of num is %p\n", &num);

  // print the values and addresses of the pointer
  printf("The value of ptr is %p\n", ptr);
  printf("The value at the address stored in ptr is %d\n", *ptr);

  return 0;
}
