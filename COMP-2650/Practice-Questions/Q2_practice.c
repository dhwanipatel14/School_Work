

#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/stat.h>
#include<string.h>
#include<ctype.h>


int main(int argc,char* argv[]){
    int fd,fd1,ch,ch1;
    char buffer[100],buffer2[100];
    pid_t pid;
    unlink("../fifo_PtoC");
    unlink("../fifo_CtoP");
    if(mkfifo("../fifo_PtoC",0777)==-1){
        perror("Error in fifo.\n");
        exit(1);
    }
    if(mkfifo("../fifo_CtoP",0777)==-1){
        perror("Error in fifo.\n");
        exit(1);
    }
    if((pid=fork())==-1){
        perror("Error in fork.\n");
        exit(0);
    }
    //Child
    if(pid==0){
        while(1){
            
            fd = open("../fifo_PtoC",O_RDONLY);
            fd1 = open("../fifo_CtoP",O_WRONLY);
            read(fd,buffer2,strlen(buffer2)+1);
            int len = strlen(buffer2);
            for(int i=0;i<len;i++){
                buffer2[i] = toupper(buffer2[i]);
            }
            write(fd1,buffer2,strlen(buffer2)+1);
           // close(fd1);
        }
    }
    else{
        while (1)
        {
            char output[100];
            fd = open("../fifo_PtoC",O_WRONLY);
            fd1=open("../fifo_CtoP",O_RDONLY);
            fprintf(stderr,"Please enter block of code.\n");
            scanf("%s",buffer);
            write(fd,buffer,strlen(buffer)+1);
           // close(fd);
            
            read(fd1,output,100);
            printf("Output: %s",output);
           }
        

    }

}
