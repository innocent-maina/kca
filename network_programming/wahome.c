#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>

#define PORT 8080
#define MAX_CLIENTS 5

int main(int argc, char const *argv[]) {
    int server_fd, client_fd;
    struct sockaddr_in address;
    int opt = 1;
    int addrlen = sizeof(address);

    // Create server socket file descriptor
    if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0) {
        perror("socket failed");
        exit(EXIT_FAILURE);
    }

    // Set socket options
    if (setsockopt(server_fd, SOL_SOCKET, SO_REUSEADDR | SO_REUSEPORT, &opt, sizeof(opt))) {
        perror("setsockopt failed");
        exit(EXIT_FAILURE);
    }

    // Bind socket to address and port
    address.sin_family = AF_INET;
    address.sin_addr.s_addr = INADDR_ANY;
    address.sin_port = htons(PORT);
    if (bind(server_fd, (struct sockaddr *)&address, sizeof(address)) < 0) {
        perror("bind failed");
        exit;
    }
// Listen for incoming client connections
if (listen(server_fd, MAX_CLIENTS) < 0) {
perror("listen failed");
exit(EXIT_FAILURE);
}
printf("Server listening on port %d...\n", PORT);

// Accept incoming client connections sequentially
for (int i = 0; i < MAX_CLIENTS; i++) {
    printf("Waiting for client %d to connect...\n", i+1);
    if ((client_fd = accept(server_fd, (struct sockaddr *)&address, (socklen_t*)&addrlen)) < 0) {
        perror("accept failed");
        exit(EXIT_FAILURE);
    }
    printf("Client %d connected successfully!\n", i+1);

    // Receive integer choice variable from client
    int choice;
    if (read(client_fd, &choice, sizeof(choice)) < 0) {
        perror("read failed");
        exit(EXIT_FAILURE);
    }
    printf("Received choice %d from client %d\n", choice, i+1);

    // Receive two integer values from client
    int value1, value2;
    if (read(client_fd, &value1, sizeof(value1)) < 0 || read(client_fd, &value2, sizeof(value2)) < 0) {
        perror("read failed");
        exit(EXIT_FAILURE);
    }
    printf("Received values %d and %d from client %d\n", value1, value2, i+1);

    // Handle client request based on choice variable
    int result;
    switch (choice) {
        case 1:
            result = value1 + value2;
            break;
        case 2:
            result = value1 - value2;
            break;
        case 3:
            result = value1 * value2;
break;
case 4:
if (value2 == 0) {
perror("division by zero");
exit(EXIT_FAILURE);
}
result = value1 / value2;
break;
default:
perror("invalid choice");
exit(EXIT_FAILURE);
}

// Send result back to client
if (send(client_fd, &result, sizeof(result), 0) < 0) {
    perror("send failed");
    exit(EXIT_FAILURE);
}
printf("Sent result %d to client %d\n", result, i+1);

// Close client socket
close(client_fd);
}

// Close server socket
close(server_fd);

return 0;
}
