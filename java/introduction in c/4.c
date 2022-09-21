//     4) The value of y is calculated as follows:-
//y = 4x3 + 2x – 6                       when x > 5
//y = 3x2 – 4y + 12                     when x < 5
//y = 6x – 5                                 when x = 5
//Write a program that accepts the value x and then computes the value of y.

#include <stdio.h>

int main() {
    int x, y;
    printf("Enter a number\n");
    scanf("%d", &x);
    if (x > 5) {
        y = 4 * x * x * x + 2 * x - 6;
        printf("The value of y is %d", y);
    } else if (x < 5) {
        y = 3 * x * x - 4 * x + 12;
        printf("The value of y is %d", y);
    } else {
        y = 6 * x - 5;
        printf("The value of y is %d", y);
    }
    return 0;
}
