#include <unistd.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>   
#include <sys/wait.h>
#include <stdlib.h>
void main(int argc, char *argv[]){
     
    int fd[2],pid; 
    char ch;
    //creating pipe so parent and child process can communicate with each other.
    if (pipe(fd) == -1){
        exit(1);
    }
 
    if((pid=fork())<0){
        perror("Error in fork.\n");
        exit(0);
    }
    if (pid == 0){  //child process
        close(fd[0]);  //closing the reading end of the pipe as child is suppose to write only
        dup2(fd[1], 1); //writing to the file from the user using dup2 system call
        close(fd[1]);  //closing the writing end
        execlp(argv[1],argv[1],argv[2],(char*)0); //executing the shell command using execlp
    }
     //parent process
     else{
        close (fd[1]);//Closing the writing end of the pipe  
        int numOfBytes =0;
        int new_fd = open("result.txt", O_CREAT|O_RDWR|O_TRUNC ,0777);
         
        while((read(fd[0],&ch,1))!=0){ //Reading from the file 
            write(new_fd,&ch,1); //writing to new file 
            numOfBytes++; //Counting number of bytes successfully executed.
        }
        
        printf ("The result of %s is written into result.txt with total %d bytes.\n",argv[1],numOfBytes);
        close(fd[0]);//closing the reading end
    }
}