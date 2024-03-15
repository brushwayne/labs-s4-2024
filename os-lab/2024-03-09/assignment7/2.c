#include <stdio.h>

void find_wait_time(int n, int burst_time[], int wait_time[]) {
    wait_time[0] = 0; 
    for (int i = 1; i < n; i++) {
        wait_time[i] = burst_time[i - 1] + wait_time[i - 1];
    }
}

void find_turn_around_time(int n, int burst_time[], int wait_time[], int tat[]) {
    for (int i = 0; i < n; i++) {
        tat[i] = burst_time[i] + wait_time[i];
    }
}

void find_avg_time(int n, int burst_time[]) {
    int wait_time[n], tat[n], total_wt = 0, total_tat = 0;

    find_wait_time(n, burst_time, wait_time);
    find_turn_around_time(n, burst_time, wait_time, tat);

    printf("Process\tBurst Time\tWaiting Time\tTurn Around Time\n");
    for (int i = 0; i < n; i++) {
        total_wt = total_wt + wait_time[i];
        total_tat = total_tat + tat[i];
        printf(" P[%d]\t%d\t\t%d\t\t%d\n", i + 1, burst_time[i], wait_time[i], tat[i]);
    }

    float avg_wt = (float)total_wt / (float)n;
    float avg_tat = (float)total_tat / (float)n;

    printf("Average Waiting Time = %f \n", avg_wt);
    printf("Average Turnaround Time = %f \n", avg_tat);
}

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    int burst_time[n];
    printf("Enter burst time for each process: \n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &burst_time[i]);
    }

    find_avg_time(n, burst_time);
    return 0;
}
