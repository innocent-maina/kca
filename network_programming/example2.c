#include<pthread.h>
#include<stdio.h>
#define NUM_THREADS 5

void *PrintHello(void *threadid){
  int tid;
  // fix the below line
  tid = (int)threadid;
  printf("Hello World! It's me, thread #%d!\n", tid);
  pthread_exit(NULL);
}



int main (int argc, char *argv[]) {
  pthread_t threads[NUM_THREADS];
  int rc, t;
  for(t=0; t<NUM_THREADS; t++){
    printf("In main: creating thread %d\n", t);
    pthread_create(&threads[t], NULL, PrintHello, (void *)(long)t);
  }

  printf("Bye!! from main\n");

  return 0;
}
