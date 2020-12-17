
public class Person implements Comparable<Person>{
	private String name;
	/*
	 * Default constructor
	 */
	public Person(String name) {
		this.name = name;
	}
	/*
	 * Method To get Name of person
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	/*
	 * Compare to method to compare names
	 */
	@Override
	public int compareTo(Person p) {
		return this.name.toLowerCase().compareTo(p.name.toLowerCase());
	}

}
