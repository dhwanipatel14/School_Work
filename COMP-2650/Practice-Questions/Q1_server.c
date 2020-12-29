
#include <stdio.h>
#include <string.h>
#include <fcntl.h>
#include <netinet/in.h>
#include <unistd.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <stdlib.h>

int main(int argc, char argv[]){
        int sd, clientsd, n;
        char buffer[100];
        char fName[100];
        socklen_t len;
        struct sockaddr_in servAdd;
        if((sd = socket(AF_INET, SOCK_STREAM, 0)) == -1){
                perror("socket call failed");
                exit(1);
        }
        servAdd.sin_family = AF_INET;
        servAdd.sin_addr.s_addr = inet_addr("137.207.82.51");
        servAdd.sin_port = 7780;
        if(bind(sd, (struct sockaddr)&servAdd, sizeof(servAdd)) == -1){
                perror("bind call failed");
                exit(1);
        }
        if(listen(sd, 2) == -1){
                perror("listen call failed");
                exit(1);
        }
        if((clientsd = accept(sd,NULL,NULL)) == -1){
                perror("accept call failed");
        }
        printf("Got a client\n");
        while(read(clientsd, fName, 100) == 0){
        }
        int fd = open(fName, O_RDONLY);
        printf("File name: %s\n", fName);
        n = read(fd, buffer, 100);
        write(clientsd, buffer, n);
        printf("%s\n", buffer);
        printf("done\n");
        //sleep(5);
        close(fd);
        close(clientsd);
}



/*#include<unistd.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<string.h>
#include<netdb.h>
#include <stdio.h>
#include <netinet/in.h>
#include <arpa/inet.h>

int main(int argc,char*argv[]){
    int sd,client;
    socklen_t len;
    struct sockaddr_in servAdd;
    struct sockaddr_in clientAdd;
    char buffer[100];
    if((sd = socket(AF_INET,SOCK_STREAM,0))==-1){
        perror("Error in socket");

    }
    servAdd.sin_family =AF_INET;
    servAdd.sin_addr.s_addr = inet_addr("137.207.82.51");
    servAdd.sin_port = 7777;
    bind(sd,(struct sockaddr *)&servAdd,sizeof(servAdd));
    listen(sd,5);
    while (1)
    {
        len = sizeof(client);
        client = accept(sd,(struct sockaddr*)&clientAdd,&len);
        write(client,"What is file name?\n",strlen("What is file name?\n"));
        read(client,buffer,strlen(buffer));
        printf("%s",buffer);

    }
    
    
}*/