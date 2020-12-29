#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <stdlib.h>

void action(int dummy){};
int main(int argc,char* argv[]){
    int pid,number;
    //Storing argument
    char *num = argv[1];
    number = atoi(num);//Converting to integer from string
   
    if((pid=fork())==-1){
        perror("Error in fork.\n");
    }
    else if(pid==0){
        //Child process
        sleep(number);//sleeping for few seconds 
        kill(getppid(),SIGALRM);//Sending signal to parent
    }
    else {
        //parent
        signal(SIGALRM,action); 
        printf("Waiting for alaram.\n");
        printf("<%d seconds pause.>\n",number);
        pause(); //Reciving signal
        printf("Ding!\ndone\n");//Printing message
    }
    exit(0);
}