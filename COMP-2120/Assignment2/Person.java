/*
 *  The purpose of this class is to craete person with his different properties.
 */
public class Person {
	private String firstName;
	private String lastName;
	private String cellNumber;
	private int birthDay;
	private int birthMonth;
	/*
	 * Default Constructor
	 */
	public Person() {
		this.firstName = " ";
		this.lastName = " ";
		this.cellNumber = "000-000-0000";
		this.birthDay = 0;
		this.birthMonth = 0;
		
	}
	/*
	 * Second Constructor with
	 * @param firstname First Name of the person
	 * @param lastname Last Name of the person
	 */
	public Person(String firstname,String lastname) {
		this();
		this.firstName = firstname;
		this.lastName = lastname;
	}
	/*
	 * Third Constructor with 
	 * @param firstname FirstName of the person
	 * @param lastname LastName of the person
	 * @param birthMonth Birthday Month of the person
	 * @param cellNumber Phone number of the person
	 */
	public Person(String firstname,String lastname,int birthMonth,int birthDay,String cellNumber) {
		this(firstname,lastname);
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.cellNumber = cellNumber;
	}
	/*
	 * Accessors Methods
	 */
	/*
	 * @return firstName Fisrt Name of the person
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName Last Name of the person
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return cellNumber Phone number of the person
	 */
	public String getCellNumber() {
		return cellNumber;
	}
	/*
	 * @return birthDay of the person
	 */
	public int getBirthDay() {
		return birthDay;
	}
	/*
	 * @return birthMonth of the person
	 */
	public int getBirthMonth() {
		return birthMonth;
	}
	
	// Mutator methods
	/*
	 * @param firstName First Name of the person
	 */
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	/*
	 * @param lastName Last Name of the person
	 */
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	/*
	 * @param cellNumber Phone number of the person
	 */
	public void setCellNumber(String cellNumber) {
		 this.cellNumber = cellNumber;
	}
	/*
	 * @param birthDay Birth day of the person
	 */
	public void setBirthDay(int birthDay) {
		 this.birthDay= birthDay;
	}
	/*
	 * @param birthMonth Birth Month of the person
	 */
	public void setBirthMonth(int birthMonth) {
		 this.birthMonth= birthMonth;
	}
	/*
	 * ToString method 
	 */
	public String toString(){
		return "Name: "+ firstName + " " + lastName + "\t"+ "BirthDay: "+ birthMonth + "/"+ birthDay ;
	} 



}
