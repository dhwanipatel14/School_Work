import java.util.Random;
import java.util.Scanner;

public class ComboLockTester {

	public static void main(String[] args) {

		int digit1,digit2,digit3, number1, number2, number3;
		char ch;
		Scanner in = new Scanner(System.in);
        System.out.println("The Combination Lock has number in Range 0 to 39.");
        System.out.print("Enter the secret number 1: ");
        digit1 = in.nextInt();
        if(digit1<0 || digit1>39) {
        	 System.out.print("Please enter in correct Range: ");
             digit1 = in.nextInt();         
        }
        	
        System.out.print("Enter thr secret number 2: ");
        digit2 = in.nextInt();
        if(digit2<0 || digit2>39) {
       	 System.out.print("Please enter in correct Range: ");
            digit2 = in.nextInt();         
       }
        System.out.print("Enter thr secret number 3: ");
        digit3 = in.nextInt();
        if(digit3<0 || digit3>39) {
       	 System.out.print("Please enter in correct Range: ");
            digit3 = in.nextInt();         
       }

		ComboLock lock1 = new ComboLock(digit1,digit2,digit3);
		while (true) {
			System.out.println("Enter 0,0,0 to exit.");
			System.out.println("Enter the number of ticks to turn Right: ");
			number1 = in.nextInt();
			lock1.turnRight(number1);
			if(number1<0 || number1>39) {
	        	 System.out.print("Please enter in correct Range: ");
	             number1 = in.nextInt();         
	        }
			
			System.out.println("Enter the number of ticks to turn Left: ");
			number2 = in.nextInt();
			lock1.turnLeft(number2);
			if(number2<0 || number2>39) {
	        	 System.out.print("Please enter in correct Range: ");
	             number2 = in.nextInt();         
	        }
			
			System.out.println("Enter the number of ticks to turn Right: ");
			number3 = in.nextInt();
			lock1.turnRight(number2);
			if(number3<0 || number3>39) {
	        	 System.out.print("Please enter in correct Range: ");
	             number3 = in.nextInt();         
	        }

		if ((number1 == 0) && (number2 == 0) && (number3 == 0)) {
				System.out.println("Bye!!!! Have a great Day");
			break;
			}

			if (!lock1.open()) {
				lock1.reset();
				System.out.println("Sorry! The Combination is incorrect.\n");
			} else {
				System.out.println("Hurrah! You successfully opened it .");
				break;
			}
		}

	}

}
