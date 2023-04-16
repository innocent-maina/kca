#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <pthread.h>

#define PORT 8080
#define MAX_CLIENTS 5

void *handle_client(void *arg);

void *handle_client(void *arg)
{
  // Extract the client file descriptor from the thread argument
  int client_fd = *((int *)arg);

  // Receive the choice and two integers from the client
  int choice, num1, num2;
  if (read(client_fd, &choice, sizeof(choice)) < 0)
  {
    perror("read failed");
    close(client_fd);
    pthread_exit(NULL);
  }
  if (read(client_fd, &num1, sizeof(num1)) < 0)
  {
    perror("read failed");
    close(client_fd);
    pthread_exit(NULL);
  }
  if (read(client_fd, &num2, sizeof(num2)) < 0)
  {
    perror("read failed");
    close(client_fd);
    pthread_exit(NULL);
  }

  // Perform the operation based on the choice and send the result back to the client
  int result;
  switch (choice)
  {
  case 1:
    result = num1 + num2;
    break;
  case 2:
    result = num1 * num2;
    break;
  case 3:
    result = num1 - num2;
    break;
  case 4:
    printf("Closing connection with client\n");
    close(client_fd);
    pthread_exit(NULL);
  default:
    printf("Invalid choice received from client\n");
    close(client_fd);
    pthread_exit(NULL);
  }
  if (write(client_fd, &result, sizeof(result)) < 0)
  {
    perror("write failed");
    close(client_fd);
    pthread_exit(NULL);
  }

  // Close the client connection and exit the thread
  close(client_fd);
  pthread_exit(NULL);
}


int main(int argc, char const *argv[])
{
  int server_fd, new_socket, valread;
  struct sockaddr_in address;
  int opt = 1;
  int addrlen = sizeof(address);

  // Create socket file descriptor
  if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0)
  {
    perror("socket failed");
    exit(EXIT_FAILURE);
  }

  // Attach socket to the port 8080
  if (setsockopt(server_fd, SOL_SOCKET, SO_REUSEADDR | SO_REUSEPORT, &opt, sizeof(opt)))
  {
    perror("setsockopt failed");
    exit(EXIT_FAILURE);
  }
  address.sin_family = AF_INET;
  address.sin_addr.s_addr = INADDR_ANY;
  address.sin_port = htons(PORT);

  // Bind the socket to the specified address and port
  if (bind(server_fd, (struct sockaddr *)&address, sizeof(address)) < 0)
  {
    perror("bind failed");
    exit(EXIT_FAILURE);
  }

  // Listen for incoming connections
  if (listen(server_fd, MAX_CLIENTS) < 0)
  {
    perror("listen failed");
    exit(EXIT_FAILURE);
  }

  // Handle incoming connections
  while (1)
  {
    if ((new_socket = accept(server_fd, (struct sockaddr *)&address, (socklen_t *)&addrlen)) < 0)
    {
      perror("accept failed");
      exit(EXIT_FAILURE);
    }

    // Create a new thread to handle the incoming client connection
    pthread_t thread_id;
    if (pthread_create(&thread_id, NULL, handle_client, (void *)&new_socket) < 0)
    {
      perror("pthread_create failed");
      exit(EXIT_FAILURE);
    }
  }

  return 0;
}

