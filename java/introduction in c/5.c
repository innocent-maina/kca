// Write a program that accepts marks scored in five subjects and then computes the average and prints the order of merit based on the average mark.

#include <stdio.h>

int main() {
    int subject1, subject2, subject3, subject4, subject5, total;
    float average;
    printf("Enter the marks scored in subject1\n");
    scanf("%d", &subject1);
    printf("Enter the marks scored in subject2\n");
    scanf("%d", &subject2);
    printf("Enter the marks scored in subject3\n");
    scanf("%d", &subject3);
    printf("Enter the marks scored in subject4\n");
    scanf("%d", &subject4);
    printf("Enter the marks scored in subject5\n");
    scanf("%d", &subject5);
    total = subject1 + subject2 + subject3 + subject4 + subject5;
    average = total / 5;
    if (average > 75 && average <= 100) {
        printf("The average is %f and the order of merit is Distinction", average);
    } else if (average > 65 && average <= 75) {
        printf("The average is %f and the order of merit is Credit", average);
    } else if (average > 50 && average <= 65) {
        printf("The average is %f and the order of merit is Pass", average);
    } else if (average > 0 && average <= 50) {
        printf("The average is %f and the order of merit is Fail", average);
    }
    return 0;
}
