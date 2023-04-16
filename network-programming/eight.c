#include <stdio.h>

// imported the struct wombat
struct Wombat {
    float f;
    long L;
    struct Wombat *Next;
    char Name[20];
};

// main function
int main() {
  // declare the struct wombat
    struct Wombat Ralph;
    struct Wombat Munroe[10];

  // set the values of the struct
    Ralph.f = 13.7;
    strcpy(Ralph.Name, "The Doctor");

    return 0;
}
