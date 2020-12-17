/*
 * @import Scanner class to get user input.
 */
import java.util.Scanner;
/*
 * The purpose of this microwave class is to understand different functions of Microwave.
 */

class Microwave{
	/*
	 * Five buttons as variables of Microwave class
	 * 
	 */
	private int time;
	private int status;
	enum power_level{
		LOW,MEDIUM,HIGH
	};
	private power_level level;
	public static final int STOPPED = 0;
	public static final int RUNNING = 1;
	
	public Microwave() {
		this.time = 0;
		this.status = STOPPED;
		this.level = level.LOW;
	}
	
	/*
	 * Accessor method to get powerlevel
	 * @return level
	 */
	public power_level getpowerlevel() {
		return this.level;
	}
	/*
	 * Accessor to get Time
	 * @return time
	 */
	public int getTime() {
		return this.time;
	}
	/*
	 * Mutator method to increase time of microwave
	 */
	public void increaseTime(){
		this.time = time + 30;
	}
	/*
	 * Method to change level by getting user input.
	 */
	public void changeLevel	() {
		System.out.println("ENTER POWER BUTTON TO CHANGE THE LEVEL.\n1 = LOW   2 = MEDIUM  3 = HIGH : ");
		Scanner input = new Scanner(System.in);
		int newLevel = input.nextInt();
		switch(newLevel) {
		case 1:
			this.level = level.LOW;
			System.out.println("Your powerlevel is succesfully changed to LOW.");
			break;
		case 2:
			this.level = level.MEDIUM;
			System.out.println("Your powerlevel is succesfully changed to MEDIUM.");
			break;
		case 3:
			this.level = level.HIGH;
			System.out.println("Your powerlevel is succesfully changed to HIGH.");
			break;
			default:
		System.out.println("Please Enter valid number to change level.");
				
		}
		
		
	}
	/*
	 * Method to start the microwvae.
	 */
	public void start() {
		System.out.printf("Cooking for %d seconds at level %s .\n",time,this.level); 
		this.status = RUNNING;
		
	}
	/*
	 * Method to Stop the microwave.
	 */
	public void stop() {
		System.out.printf("Your Cooking is Successfully done for %d seconds at level %s.\n",time,this.level);
		this.status = STOPPED;
		
	}
	/*
	 * Method to reset the microwave.
	 */
	public void reset() {
		this.time = 0;
		this.level = level.LOW;
		this.status = STOPPED;
		System.out.println("YOUR MICROWAVE IS SUCCESFULLY at RESET mode.");
		
	}
	
	
}

