import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
	File input ;
	/*
	 * Default Constructor
	 */
	public CSVReader(String filename) {
		input = new File(filename);
	}
	/*
	 * Method to get numberOfRows
	 * @return rows Total rows
	 */
	public int numberOfRows() throws FileNotFoundException {
		int rows=0;
		Scanner in = new Scanner(this.input);
		while(in.hasNextLine()) {
			rows++;
			in.nextLine();
		}
		in.close();
		return rows;
	}
	/*
	 * Method to get numberofFields
	 * @return fields in row
	 */
	public int numberOfFields(int row) throws FileNotFoundException {
		String line="";
		Scanner in = new Scanner(this.input);
		for(int i=0;i<=row;i++) {
			if(in.hasNextLine()) {
				line = in.nextLine();
			}
		}
		in.close();
		return (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1)).length;
	}
	/*
	 * Method to get Number of element in particular location
	 * @return element in given row and column
	 */
	public String field(int row,int col) throws FileNotFoundException {
		String line="";
		Scanner in = new Scanner(this.input);
		for(int i=0;i<=row;i++) {
			if(in.hasNextLine()) {
				line = in.nextLine();
			}
		}
		in.close();
		String[] newLine  = (line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1));
		return newLine[col];
	}
	
	
	

}
