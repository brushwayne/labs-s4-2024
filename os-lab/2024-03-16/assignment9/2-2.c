#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {  
        printf("Child process (PID: %d, PPID: %d)\n", getpid(), getppid());
        pid = fork();   

        if (pid == 0) {  
            printf("Grandchild process (PID: %d, PPID: %d)\n", getpid(), getppid());
        } else {
            wait(NULL);  
        }
    } else {
        wait(NULL);
        printf("Parent process (PID: %d)\n", getpid());
    }

    return 0;
}
