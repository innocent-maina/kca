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

    return 0;
}
