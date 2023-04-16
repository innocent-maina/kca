#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#define PORT 8080

int main(int argc, char const *argv[]) {
    int sock = 0, valread;
    struct sockaddr_in serv_addr;
    int choice, num1, num2;

    if ((sock = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
        printf("\n Socket creation error \n");
        return -1;
    }

    memset(&serv_addr, '0', sizeof(serv_addr));

    serv_addr.sin_family = AF_INET;
    serv_addr.sin_port = htons(PORT);

    if (inet_pton(AF_INET, "127.0.0.1", &serv_addr.sin_addr) <= 0) {
        printf("\nInvalid address/ Address not supported \n");
        return -1;
    }

    if (connect(sock, (struct sockaddr *)&serv_addr, sizeof(serv_addr)) < 0) {
        printf("\nConnection Failed \n");
        return -1;
    }

    printf("Use the choices in the question to do the calculation ");

    scanf("%d", &choice);
    printf("first number: ");
    scanf("%d", &num1);
    printf("second number: ");
    scanf("%d", &num2);

    write(sock, &choice, sizeof(choice));
    write(sock, &num1, sizeof(num1));
    write(sock, &num2, sizeof(num2));

    int result;
    if (read(sock, &result, sizeof(result)) < 0) {
        printf("Read error\n");
        return -1;
    }

    printf("Result: %d\n", result);

    close(sock);

    return 0;
}
