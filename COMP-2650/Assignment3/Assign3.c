#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/wait.h>

void childFunction(char *line);
int main(void)
{
    int fd1,n,pid;
    char string[100];
    char buffer1[] = "This program makes simple arithmatic.\n"; //buffer to store printing lines
    char buffer2[] = "Enter an Arithmatic Statement: ";
    char buffer3[100];
    char buffer4[200] = "Created a child to make your operation, waiting\n";
    //used write system call to write to the terminal purpose of program.
    write(1,buffer1,strlen(buffer1));
    int count = 1;
    //Now enters in the infinite loop.
    while(count)
    {
        //Asking for the user input of the operations.
        write(1,buffer2,strlen(buffer2));
        //Reading user input
        n = read(0,buffer3,sizeof(buffer3));
        if(n==-1){
            perror("Read unsuccessfull.\n");
        }
        //Forking parent and child process
        pid = fork();
        //Condition to check fork is successfull or not
        if(pid<0)
        {
            perror("Error in fork.");
            exit(1);
        }
        //Entering in the Parent process
        if(pid>0)
        {
            //witing the mesage
            write(1,buffer4,strlen(buffer4));
            int status;
            //waiting for the child process
            wait(&status);
            //getting the child status using bitwise manupulation
            int child_status = status>>8;
            //condition to check if statement is correct or not.
            if(child_status == 50)
            {
                write(1,"Wrong Statement\n",strlen("Wrong Statement\n"));
            }
            //condition to check if users enter division by zero
            if(child_status == 100)
            {
                write(1,"Division By Zero\n",strlen("Division by Zero\n"));
            }
            //Condition to check wrong operator in statement
            if(child_status == 200)
            {
                write(1,"Wrong Operator\n",strlen("Wrong Operator\n"));
            }
            count = 1;

        }
        //Entering in Child Process
        else if(pid==0)
        {
            //Calling the child function
            childFunction(buffer3);
            exit(1);
        }

    }
}
void childFunction(char *line)
{
    int num1,num2,result;
    char op_ch,output[100];
    //Writing message to Terminal
    write(1,"I am Child working with my parent.\n",strlen("I am Child working with my parent.\n"));
    //Using sscanf to convert input line to different characters and numbers.
    int check = sscanf(line,"%d%c%d",&num1, &op_ch, &num2);
    //Condition to check if user enters correct numbers by return value of sscanf
    if(check != 3)
    {
        exit(50);
    }
    //Condition to check DivisionBy Zero
    if((op_ch== '/') && (num2 == 0))
    {
        exit(100);
    }
    //Using switch case to perform the arithmatic calculations if user enetered correct statement;
    switch(op_ch)
    {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1*num2;
        break;
    case '/':
        result = num1/num2;
        break;
    default:
        exit(200);
    }
    //Storing the output using sprintf
    sprintf(output,"Calculation: %d%c%d=%d\n",num1,op_ch,num2,result);
    write(1,output,strlen(output));
    exit(0);
}
