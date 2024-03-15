#include <stdio.h>
#include <limits.h>
#include <stdbool.h>

typedef struct Process {
    int pid; // Process ID
    int bt; // Burst Time
    int arrival_t; // Arrival Time
} Process;


void find_wait_time(Process proc[], int n, int wt[]) {
    int rt[n];

    for (int i = 0; i < n; i++)
        rt[i] = proc[i].bt;

    int complete = 0, t = 0, minm = INT_MAX;
    int shortest = 0, finish_time;
    bool check = false;

    while (complete != n) {

        for (int j = 0; j < n; j++) {
            if ((proc[j].arrival_t <= t) &&
            (rt[j] < minm) && rt[j] > 0) {
                minm = rt[j];
                shortest = j;
                check = true;
            }
        }

        if (check == false) {
            t++;
            continue;
        }

        rt[shortest]--;

        minm = rt[shortest];
        if (minm == 0)
            minm = INT_MAX;

        if (rt[shortest] == 0) {

            complete++;
            check = false;

            finish_time = t + 1;

            wt[shortest] = finish_time -
                        proc[shortest].bt -
                        proc[shortest].arrival_t;

            if (wt[shortest] < 0)
                wt[shortest] = 0;
        }

        t++;
    }
}


void find_turn_around_time(Process proc[], int n, int wt[], int tat[]) {
    for (int i = 0; i < n; i++)
        tat[i] = proc[i].bt + wt[i];
}

void find_avg_time(Process proc[], int n) {
    int wt[n], tat[n], total_wt = 0,
                    total_tat = 0;


    find_wait_time(proc, n, wt);


    find_turn_around_time(proc, n, wt, tat);

    printf("Process ID\tBurst Time\tWaiting Time\tTurnAround Time\n");

    for (int i = 0; i < n; i++) {
        total_wt = total_wt + wt[i];
        total_tat = total_tat + tat[i];
        printf("%d\t\t%d\t\t%d\t\t%d\n",proc[i].pid,proc[i].bt,wt[i],tat[i]);
    }

     printf("Average Turn Around Time = %.2f\nAverage Waiting Time = %.2f\n",(total_tat/(float)n),(total_wt/(float)n));
}


int main() {
    int num;
    printf("Enter the number of processes -> ");
    scanf("%d",&num);
    Process proc[num];

    for(int i=0; i<num; i++)
    {
        printf("Process %d\n",i+1);
        printf("Enter the process ID -> ");
        scanf("%d",&proc[i].pid);
        printf("Enter the arrival time -> ");
        scanf("%d",&proc[i].arrival_t);
        printf("Enter the burst time -> ");
        scanf("%d",&proc[i].bt);
    }

    find_avg_time(proc, num);
    return 0;
}
