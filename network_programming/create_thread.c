#include<pthread.h>
#include<stdio.h>

void *my_thread(void *arg)
{
  int i;
  for (i=0; i<5; i++)
  printf("Hello world! \n");
  return NULL;
}

int main() {
  pthread_t tid;
  printf("Thread execution begins\n");
  pthread_create(&tid, NULL, my_thread, NULL);
  pthread_join(tid, NULL);

  printf("Thread execution ends\n");

  printf("Main thread is working\n");

  return 0;
}
