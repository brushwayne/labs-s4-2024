#include <stdio.h>
#include <pthread.h>

int arr[100];
int n, sum1 = 0, sum2 = 0;

void *sum_first_half(void *arg) {
    for (int i = 0; i < n / 2; i++) {
        sum1 += arr[i];
    }
    return NULL;
}

void *sum_second_half(void *arg) {
    for (int i = n / 2; i < n; i++) {
        sum2 += arr[i];
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

    pthread_t thread1, thread2;
    pthread_create(&thread1, NULL, sum_first_half, NULL);
    pthread_create(&thread2, NULL, sum_second_half, NULL);

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);

    int total_sum = sum1 + sum2;
    printf("Total sum: %d\n", total_sum);

    return 0;
}
