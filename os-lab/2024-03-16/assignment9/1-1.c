#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    for (int i = 0; i < 5; i++) {
        pid_t pid = fork();

        if (pid == 0) {
            printf("Child process (PID: %d, PPID: %d)\n", getpid(), getppid());
            break;
        }
    }

    printf("Parent process (PID: %d)\n", getpid());
    return 0;
}
