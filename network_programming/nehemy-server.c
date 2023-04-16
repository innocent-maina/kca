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
  int client_fd = *((int *)arg);

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

  int result;
  if (choice == 1)
  {
    result = num1 + num2;
  }
  else if (choice == 2)
  {
    result = num1 * num2;
  }
  else if (choice == 3)
  {
    result = num1 - num2;
  }
  else if (choice == 4)
  {
    printf("Closing connection with client\n");
    close(client_fd);
    pthread_exit(NULL);
  }
  else
  {
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

  close(client_fd);
  pthread_exit(NULL);
}

int main(int argc, char const *argv[])
{
  int server_f_d, new_socket, valread;
  struct sockaddr_in address;
  int opt = 1;
  int addrlen = sizeof(address);

  if ((server_f_d = socket(AF_INET, SOCK_STREAM, 0)) == 0)
  {
    perror("socket failed");
    exit(EXIT_FAILURE);
  }

  if (setsockopt(server_f_d, SOL_SOCKET, SO_REUSEADDR | SO_REUSEPORT, &opt, sizeof(opt)))
  {
    perror("setsockopt failed");
    exit(EXIT_FAILURE);
  }
  address.sin_family = AF_INET;
  address.sin_addr.s_addr = INADDR_ANY;
  address.sin_port = htons(PORT);

  if (bind(server_f_d, (struct sockaddr *)&address, sizeof(address)) < 0)
  {
    perror("bind failed");
    exit(EXIT_FAILURE);
  }

  if (listen(server_f_d, MAX_CLIENTS) < 0)
  {
    perror("Listening to port has failed");
    exit(EXIT_FAILURE);
  }

  while (1)
  {
    if ((new_socket = accept(server_f_d, (struct sockaddr *)&address, (socklen_t *)&addrlen)) < 0)
    {
      perror("THe accept has failed");
      exit(EXIT_FAILURE);
    }

    pthread_t thread_id;
    if (pthread_create(&thread_id, NULL, handle_client, (void *)&new_socket) < 0)
    {
      perror("pthread_create function has failed");
      exit(EXIT_FAILURE);
    }
  }
  return 0;
}
