#include <stdio.h>
#include <string.h>

struct Student
{
  char name[50];
  int age;
};

int main()
{
  // setting the value of a strucutre
  struct Student student1 = {"Jack Reacher", 30};

  // changing the value of a structure
  student1.age = 31;

  // accessing the value of a structure
  printf("The name if the student is %s\n", student1.name);
  printf("The age if the student is %d\n", student1.age);

  return 0;
}
