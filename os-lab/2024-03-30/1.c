#include <stdio.h>
#include <pthread.h>

int arr[100];
int n;

void *sort_array(void *arg) {
   for (int i = 0; i < n - 1; i++) {
       for (int j = 0; j < n - i - 1; j++) {
           if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
       }
   }
   return NULL;
}

int main() {
   printf("Enter the number of elements: ");
   scanf("%d", &n);

   printf("Enter the elements: ");
   for (int i = 0; i < n; i++) {
       scanf("%d", &arr[i]);
   }

   pthread_t thread;
   pthread_create(&thread, NULL, sort_array, NULL);
   pthread_join(thread, NULL);

   printf("Sorted array: ");
   for (int i = 0; i < n; i++) {
       printf("%d ", arr[i]);
   }
   printf("\n");

   return 0;
}
