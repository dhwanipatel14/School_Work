import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonTester {

	public static void main(String[] args) {
		System.out.println("Enter 10 names of person : " );
		Scanner input = new Scanner(System.in); 
		ArrayList<Person> personList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			Person person = new Person(input.next());
			personList.add(person);
		}
		Collections.sort(personList);
		
		System.out.println("First person in list: "+ personList.get(0).getName());
		System.out.println("Last person in list: "+ personList.get(9).getName());
		
		
		

	}

}
