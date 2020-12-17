/*
 * The purpose of this class is to create Employee as a subclass of Person
 */
public class Employee extends Person {
	private int hiringYear;
	private double annualSalary;
	private int vacationDays;
	private int unusedVacationDays;
	
	/*
	 * Default Constructor
	 */
	public Employee() {
		super();
		this.hiringYear = 0;
		this.annualSalary = 0;
		this.unusedVacationDays = 0;
		this.vacationDays = 7;
	}
	/*
	 * Second Constructor with 
	 * @param firstname firstname of Employee
	 * @param lastname Lastname of the Employee
	 * @param month Birthday Month of Employee
	 * @paarm day Birthday of employee
	 */
	public Employee(String firstname,String lastname, int month,int day) {
		this();
		this.setBirthDay(day);
		this.setBirthMonth(month);
		this.setFirstName(firstname);
		this.setLastName(lastname);	
	}
	/*
	 * Third constructor with more 
	 * @param hiringYr Hiring year of the employee
	 * @param salaray Annual Salary of Employee
	 */
	public Employee(String firstname,String lastname,int month,int day,int hiringYr,double salary) {
		this(firstname,lastname,month,day);
		this.hiringYear = hiringYr;
		this.annualSalary = salary;
	}
	//Getters/Accesssor Methods
	/*
	 * @return hiringYear hiring year of employee
	 */
	public int getHiringYear() {
		return this.hiringYear;
	}
	/*
	 * @return vacationDays VactaionDays of employee
	 */
	public int getVacationDays() {
		return this.vacationDays;
	}
	/*
	 * @return annualSalary annual Salary of the employee
	 */
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	/*
	 * @return unusedvacaationDays of the employee
	 */
	public int getUnusedDays() {
		return this.unusedVacationDays;
	}
	
	
	//Setters/Mutator methods
	/*
	 * @return hiringYear of the employee
	 */
	public void setHiringYear(int year) {
		this.hiringYear = year;
	}
	/*
	 * @return annualSalary of the employee
	 */
	public void setAnnualSalary(double salary) {
		this.annualSalary = salary;
	}
	/*
	 * @return vactionDays of teh employee
	 */
	public void setVacationDays(int days) {
		this.vacationDays = days;
	}
	/*
	 * @return unusedVacationDays of the employee
	 */
	public void setUnusedDays(int days) {
		this.unusedVacationDays = days;
	}

	
}
