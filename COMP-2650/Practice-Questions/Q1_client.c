/*#include<unistd.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<string.h>
#include<netdb.h>
#include <stdio.h>
#include <netinet/in.h>
#include <arpa/inet.h>

int main(int argc,char*argv[]){
    int csd;
    
    char buffer[100],filename[100];
    socklen_t len;
    struct sockaddr_in servAdd; 
    csd = socket(AF_INET,SOCK_STREAM,0);
    servAdd.sin_family = AF_INET;
    servAdd.sin_addr.s_addr = inet_addr(argv[1]);
    servAdd.sin_port = 7777;
    connect(csd,(struct sockaddr*)&servAdd,sizeof(servAdd));
    read(csd,buffer,100);
    fprintf(stderr,"%s\n",buffer);
    scanf("%s",filename);
    write(csd,filename,strlen(filename));


}*/
#include<unistd.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<string.h>
#include<netdb.h>
#include<netinet/in.h>
#include <arpa/inet.h>
#include<stdio.h>
#include<stdlib.h>
#include<signal.h>
#include <fcntl.h>

int main(int argc, char *argv[]){
        char buffer[100];
        int csd;
        int fd, n;
        int server;
        socklen_t len;
        struct sockaddr_in servAdd;
        csd = socket(AF_INET, SOCK_STREAM, 0);
        servAdd.sin_family = AF_INET;
        servAdd.sin_addr.s_addr = inet_addr("137.207.82.51");
        servAdd.sin_port = 7780;
        if((server = connect(csd, (struct sockaddr *) &servAdd,  sizeof(servAdd))) == -1){
                perror("connect call failed");
                exit(1);
        }
        printf("Connected to the server\n");
        write(csd, argv[1], strlen(argv[1]) + 1);
        fd = open("hello2.txt", O_WRONLY | O_CREAT | O_TRUNC, 0777);
        printf("Created the file\n");
        n = read(csd, buffer, 100);
        write(fd, buffer, n);
        printf("%s\n", buffer);
        printf("done\n");
}
