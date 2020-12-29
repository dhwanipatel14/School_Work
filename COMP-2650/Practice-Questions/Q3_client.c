#include<unistd.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<string.h>
#include<netdb.h>
#include <stdio.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <fcntl.h>

int main(int argc, char *argv[]) {
	
	int csd; //Client socket file descriptor  
	socklen_t len; //Variable to store socketlength
	struct sockaddr_in servAdd; //Server socket address
	char buffer[100]; //Buffer string
	char buffer2[100]; //Other buffer string
	int fd; //Fd for received file
	int ch; //Buffer char
	int fileSize;
	
	csd = socket(AF_INET, SOCK_STREAM, 0); //Create client socket

	servAdd.sin_family = AF_INET; //Set server address family to Internet
	servAdd.sin_addr.s_addr = inet_addr(argv[1]); //Set server address to my ip

	servAdd.sin_port = 7777; //Port to connect to; note that it is the same as the server.

	connect(csd, (struct sockaddr *) &servAdd,  sizeof(servAdd)); //Connect csd to server in port 7777

	while((read(csd, buffer, 100) == 0)) {
	} //Read into buffer from csd socket
	
	printf("%s", buffer); //Print buffer to STDOUT
	
	write(csd, "text.txt", 9); //Write message to server
	
	while((read(csd, buffer2, 100) == 0)) {
	} //Read into buffer from csd socket
	
	while(read(csd, &fileSize, sizeof(fileSize)) == 0) { //Read in file size from server
	}
	
	printf("%s\n", buffer2); //Print contents of buffer to STDOUT
	printf("%d\n", fileSize); //Print file size to STDOUT
	
	close(csd); //Close the connection before saving file bc born to die sockets is a fuck
	printf("File read successful. Copying file...\n");
	if((fd = open("received.txt", O_CREAT|O_WRONLY, 0777)) == -1) {
		perror("Open failed");
	}		//Open fd for write and create
	if((write(fd, buffer2, fileSize)) == -1) { //Write from buffer to newly created file
		perror("Write failed ");
	}
	
	printf("File download successful.\n");
	close(fd);
}