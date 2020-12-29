#include<unistd.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<string.h>
#include<netdb.h>
#include <stdio.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <fcntl.h>

int main(int argc, char *argv) {
	int sd; //Socket fd
	int client; //Int for client address
	socklen_t len; //Variable to store socket length
	char buffer[100]; //Buffer string
	char buffer2[100]; //Other buffer string
	struct sockaddr_in servAdd; //Server socket address
	struct sockaddr_in cliAdd; //Client socket address
	int fd; //File descriptor for file to send to client
	int ch;
	//Note that bother are type in, for internet
	
	sd = socket(AF_INET, SOCK_STREAM, 0); //Initialize socket
	//Specifications: Internet, TCP, default protocol
	
	servAdd.sin_family = AF_INET; //Server address is of inet family
	servAdd.sin_addr.s_addr = INADDR_ANY; //Any address
	servAdd.sin_port = 7777; //Port 7777
	
	bind(sd, (struct sockaddr*)&servAdd, sizeof(servAdd)); //Bind server address to sd socket
	
	listen(sd, 5); //Have the socket listen for a single client

	len = sizeof(cliAdd); //Socket length is size of the client address. This is for the accept call
	client = accept(sd, (struct sockaddr*)&cliAdd, &len); //Accept sd, NULL, NULL
	printf("Connected to client\n");
	//Here the server socket sd waits for a client connection, and sets that socket to client
	//The last to values are NULL because they haven't been set yet, they are to be filled with
	//the values from the client
	
	write(client, "What file would you like?\n", 27); //Write message to client
	
	while((read(client, buffer2, 100)) == 0) {
	} //Read from client in buffer
	
	printf("%s\n", buffer2); //Print msg from client to STDOUT
	
	fd = open("test.txt", O_RDONLY); //Open requested file for read only
	int fileSize = 0; //File size variable
	while(read(fd, &ch, 1)) { //Read in char from file
		buffer[fileSize] = ch; //Set buffer at filesize to ch
		fileSize++; //Increment file size
	}
	close(fd); //Close file
	printf("File read successful. Sending file...\n");
	write(client, buffer, 100); //Write file contents to buffer
	write(client, &fileSize, sizeof(fileSize)); //Send file size to client
	printf("File sent successfully.\n");
	close(client); //Close connection to client
}