#include <stdio.h>

// imported the struct wombat
struct Wombat
{
  float f;
  long L;
  struct Wombat *Next;
  char Name[20];
};

// main function
int main()
{
  // declare the struct wombat
  struct Wombat Ralph;
  struct Wombat Munroe[10];
  struct Wombat *p_wombat;

  // set the values of the struct
  p_wombat = &Munroe[0];
  p_wombat->f = 17.1;
  strcpy(p_wombat->Name, "Burgermeister");

  return 0;
}
