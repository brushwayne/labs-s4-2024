/*
Create 4 child processes and each child process communicates
with the parent process using pipe. Each child process performs
different types of operations (addition, subtraction, multiplication and division).
At the beginning, parent process shares the input data (2 numbers) with all the child processes.
After receiving the data, each child process performs the operation and sends
the result back to the parent process, so that parent process can display the results.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    int num1 = 10, num2 = 5;
    int fds[4][2];

    for (int i = 0; i < 4; i++) {
        pipe(fds[i]);
    }

    for (int i = 0; i < 4; i++) {
        int pid = fork();
        if (pid == 0) {
            close(fds[i][0]); 

            int result;
            switch (i) {
                case 0:
                    result = num1 + num2;
                    break;
                case 1:
                    result = num1 - num2;
                    break;
                case 2:
                    result = num1 * num2;
                    break;
                case 3:
                    result = num1 / num2;
                    break;
            }

            write(fds[i][1], &result, sizeof(int)); 
            close(fds[i][1]); 
            exit(0);
        }
    }

    for (int i = 0; i < 4; i++) {
        close(fds[i][1]); 

        int result;

        read(fds[i][0], &result, sizeof(int));
        printf("Result %d: %d\n", i + 1, result);

        close(fds[i][0]); 
    }

    for (int i = 0; i < 4; i++) {
        wait(NULL);
    }

    return 0;
}
