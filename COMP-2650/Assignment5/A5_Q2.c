#include<stdio.h>
#include<signal.h>
#include<unistd.h>
#include<stdlib.h>
#include<ctype.h>
#include<time.h>

int main(){
    int fd[2],num[1];
    int pid,pid2,i,j;
    long int n=0;
    char buffer[500];
    //Creating the pipe
    if(pipe(fd)==-1){
        perror("Error in pipe.");
    }
    //Error checking
    if((pid=fork())<0){
        perror("Error in fork");
        exit(1);
    }
    //Child 1 of the Parent
    else if(pid==0){
        close(fd[0]);//Closing the reading end as child jobs to write
        //Writing 5 random numbers to file 
        for(int i=0;i<5;i++){
           int  x = rand()%100 ; //Range of numbers is 0 to 99
              write(fd[1],&x,sizeof(x)); //Using write system call
        }
        printf("I am child 1 and i have successfully written 5 numbers\n");
        
    }
    else{
        pid2=fork();
        //Child 2 of same parent
        if(pid2==0){
            close(fd[0]);//Closing the reading end as child jobs to write
        //Writing 5 random numbers to file 
        for(int i=0;i<5;i++){
           int  x = rand()%100; //Range of numbers is 0 to 99
              write(fd[1],&x,sizeof(x)); //Using write system call
        }
        printf("I am child 2 and i have successfully written 5 numbers\n");
        
    }
    //Parent
        else if(pid!=0){
            sleep(1);
            close(fd[1]);//Closing the writing end
            printf("Hello I am parent going to print numbers.\n");
            for(int i=0;i<10;i++){
            read(fd[0],num,sizeof(num));//Reading and printing 10 integers
            printf("%d has be read by parent.\n",num[0]);
            }
           close(fd[0]);
        }
    }
    
}