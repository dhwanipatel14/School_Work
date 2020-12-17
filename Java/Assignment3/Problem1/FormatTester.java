import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * This is tester class the test for all different type of number format
 */
public class FormatTester {

	public static void main(String[] args) throws NumberFormatException {
		try {
		String text = "";
		int array[];
		File input = new File("C:\\Users\\Dhawni\\eclipse-workspace\\Assignment3\\Problem1\\Numbers.txt");
		Scanner in = new Scanner(input);
		PrintWriter output = new PrintWriter("FormattedNumbers.txt");
		
		while(in.hasNext()) {
			text += in.nextLine() + " ";
		}
		
		String numText[] = text.split(" ");
		
		int numbers[] = new int[numText.length];
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = Integer.parseInt(numText[i]);
		}
		NumberFormatter number = new DefaultFormatter();
		output.print("Default Format: ");
		for(int i=0;i<numbers.length;i++) {
			output.append(number.format(numbers[i])+ " ");
		}
		output.println();
		
		number = new DecimalSeparatorFormatter();
		output.print("Decimal Formatter: ");
		for(int i=0;i<numbers.length;i++) {
			output.append(number.format(numbers[i])+ " ");
		}
		output.println();
		
		number = new AccountingFormatter();
		output.print("Accounting Formatter: ");
		for(int i=0;i<numbers.length;i++) {
			output.append(number.format(numbers[i])+ " ");
		}
		output.println();
		
		number = new BaseFormatter(8);
		output.print("Base 8 Formatter: ");
		for(int i=0;i<numbers.length;i++) {
			output.append(number.format(numbers[i])+ " ");
		}
		output.println();
		
		number = new BaseFormatter(2);
		output.print("Base 2 Formatter: ");
		for(int i=0;i<numbers.length;i++) {
			output.append(number.format(numbers[i])+ " ");
		}
		output.println();
		output.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
			

	}

}
