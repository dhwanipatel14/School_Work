import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstLetterMap{
	public static void main(String[] args) {

		   File input = new File("C:\\Users\\Dhawni\\eclipse-workspace\\Assignment3\\Problem4\\test2.txt");
		   try {
			Scanner in = new Scanner(input);
			//Using Delimiter to ignore all special characters
			in.useDelimiter("\\W+");
			//Using hashMap to Store Words and character
			Map<Character,ArrayList<String>> wordList = new HashMap<Character,ArrayList<String>>();
			while(in.hasNext()) {
				String word = in.next().toLowerCase();
				char first_ch = word.charAt(0);
				if(!wordList.containsKey(first_ch)) {
					wordList.put(first_ch,new ArrayList<String>());
				}
					wordList.get(first_ch).add(word);
			}
			
			in.close();
			
			//Printing
			 for (Character key : wordList.keySet()) {
	             System.out.print(key + ": [");

	             Iterator<String> iter = wordList.get(key).iterator();
	             while (iter.hasNext()) {
	                   System.out.print(iter.next());
	                   if (iter.hasNext()) {
	                         System.out.print(", ");
	                   }
	             }
	             System.out.println("]");

	       }

			
		} catch (FileNotFoundException e) {
			
			System.out.println("File was not Found.");
		}
	}
	
}