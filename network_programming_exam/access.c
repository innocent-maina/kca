#include <stdio.h>

int main() {
    int num = 10;
    int *ptr = &num; // Store the memory address of num in ptr
    printf("The value of num is %d\n", num);
    printf("The memory address of num is %p\n", &num);
    printf("The value of ptr is %p\n", ptr);
    printf("The value at the memory address of ptr is %d\n", *ptr);
    return 0;
}
