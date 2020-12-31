import java.io.*;
import java.util.*;

public class Stack2540Dynamic {
	int CAPACITY = 100000000;
	int top;
	String[] stack;
	
	public Stack2540Dynamic() {
		stack = new String[CAPACITY];
		top = -1;
	}

	public int size() {		return top + 1;	}
	public boolean isEmpty() {		return (top == -1); }

	public String top() {
		if (top == -1)
			return null;
		return stack[top];
	}
		
	// add resize method 
public void resize(int  newcap) {
    CAPACITY = newcap;
stack = Arrays.copyOf(stack, newcap);
}

	// add pop method
public String pop() {
		if(isEmpty())
			return null;
		
			String element = stack[top];
			stack[top]=null;
			top--;
		return element;		
	}

	public void push(String element) {
  // add something here
         if(top == stack.length)
            resize(stack.length + 128);
     top++;
     stack[top] = element;
 } 
	
	static String[] reverseDynamic(String filename) throws Exception{
		Scanner scanner = new Scanner(new File(filename)).useDelimiter("[^a-zA-Z]+");
		Stack2540Dynamic stack = new Stack2540Dynamic();
		while (scanner.hasNext())
			stack.push(scanner.next().toLowerCase());
		String[] rev = new String[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			rev[i] = stack.pop();
		}
		return rev;
	}
	public static void main(String[] args) throws Exception {
		String PATH = "C:\\Users\\Dhawni\\Documents\\Data Lab\\dblp";
		//String[] METHODS = { "MERGE", "INSERT", "SELECT" };
		String[] DATASETS = { "200", "400","800","1600","3200","6400", "10000","20000","40000", "80000","160000", "320000", "640000", "1280000"};//, "10k","100k"}; //, "5k", "10k", "100k", "1m", "" };
		
		
			// run the experiments using different methods
			for (int i = 0; i < 14 ; i++) {
				//tokens = readText(PATH + DATASETS[0] + ".txt");
				System.out.println("Data is " + DATASETS[i]);
				
				long startTime = System.currentTimeMillis();
				String[]  reverseString =  reverseDynamic(PATH + DATASETS[i] + ".txt");
				long endTime = System.currentTimeMillis();
				String time = String.format("%12d", endTime - startTime);
				System.out.println( "Time for Reverse:  " + time);
			
		}
	}


}

