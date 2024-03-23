/*
Create a pipe between a parent and child process and communicate data
from parent to child through the pipe. Display the data in the parent process.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/wait.h>

int main() {
    int pipe_fds[2];
    pipe(pipe_fds);

    // 0 is for read
    // 1 is for write

    pid_t pid = fork();
    if (pid == 0) {
        close(pipe_fds[1]);
        char buffer[100];
        read(pipe_fds[0], buffer, sizeof(buffer));
        printf("Child says: %s\n", buffer);
        close(pipe_fds[0]);
        exit(0);
    } else {
        close(pipe_fds[0]);
        const char* message = "I am Father the original parent";
        write(pipe_fds[1], message, strlen(message) + 1);
        close(pipe_fds[1]);
        wait(NULL);
    }

    return 0;
}
