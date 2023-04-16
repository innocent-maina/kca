#include <stdio.h>
#include <string.h>

struct Person
{
  char name[50];
  int age;
};

int main()
{
  struct Person person1 = {"Jack Sparrow", 30};
  struct Person *ptr = &person1;

  // access members using pointers
  printf("Name of the person is %s\n", ptr->name);
  printf("Age of the person is%d\n", ptr->age);

  return 0;
}
