import java.util.ArrayList;
import java.util.Collections;
/*
 * The purpose of this class is to create Manager as a subclass of Employee
 */
public class Manager extends Employee {
	private double bonus;
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	/*
	 * Default Constructor
	 */
	public Manager() {
		super();
	}
	/*
	 * Second Constructor with 
	 * @param firstname firstname of Manager
	 * @param lastname Lastname of the Manager
	 * @param month Birthday Month of Manager
	 * @param day Birthday of Manager
	 * @param bonus Bonus of the Manager
	 */	
	public Manager(String firstname,String lastname,int month,int day,double bonus) {
		this();
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setBirthMonth(month);
		this.setBirthDay(day);
		this.bonus = bonus;
	}
	/*
	 * @return bonus of the manager
	 */
	 public double getBonus() {
		 return this.bonus;
	 }
	 /*
	  * @return ArrayList of the EMployee
	  */
	  public ArrayList<Employee> getEmployeeList(){
	    	 return this.employeeList;
	     }
	
	  /*
	   * @param bonus Bonus of the Employee
	   */
	 public void setBonus(double bonus) {
		 this.bonus = bonus;
	 }
	 /*
	  * @param add teh employee to list
	  */
	 public void setEmployeeList(Employee e) {
    	 employeeList.add(e);
     }
	 
	}
