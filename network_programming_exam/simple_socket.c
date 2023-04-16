#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>

#define PORT 8000

int main() {

 int server_fd, new_socket;
 struct socketaddr_in address;

 int address_length = sizeof(address);
 char buffer[1024] = {0};
 const char *hello = "Hello from server";

 server_fd = socket(AF_INET, SOCK_STREAM, 0);
 setsockopt(server_fd, SOL_SOCKET, SO_REUSEADDR);

 address.sin_family = AF_INET
 address.sin_addr.s_addr = INADDR_ANY;
 address.sin_port = htons(PORT);

 bind(server_fd, (struct sockaddr *)&address)
}
