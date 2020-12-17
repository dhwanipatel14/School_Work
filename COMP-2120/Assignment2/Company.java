import java.util.ArrayList;
import java.util.Collections;
/*
 * The purpose of this class is to create a Comapany
 */
public class Company {
     private String name;
     private int startingYear;
     private ArrayList<Employee> employeeList= new ArrayList<Employee>();
     private ArrayList<Manager> managerList= new ArrayList<Manager>();
     
     /*
      * Default Constructor
      */
     public Company() {
    	 this.name = " ";
    	 this.startingYear = 0;
     }
     /*
      * Second Constructor
      */
     public Company(String name,int year) {
    	 this.name = name;
    	 this.startingYear = year;
     }
     //Getters 
     /*
      * @return name Name of the Company
      */
     public String getName() {
    	 return this.name;
     }
     /*
      * @return startingYear startingYear of the company
      */
     public int getYear() {
    	 return this.startingYear;
     }
     /*
      * @return Employee list
      */
     public ArrayList<Employee> getEmployeeList(){
    	 return this.employeeList;
     }
     /*
      * return Manager List
      */
     public ArrayList<Manager> getManagerList(){
    	 return this.managerList;
     }
     /*
      * @param name Name of company
      */
     public void setName(String name) {
    	 this.name = name;
     }
     /*
      * @param startingYear starting year of the company
      */
     public void setYear(int year) {
    	 this.startingYear = year;
     }
     /*
      * @param e EmployeeList of company
      */
     public void setEmployeeList(ArrayList<Employee> e) {
    	 this.employeeList = e;
     }
     /*
      * @param m ManagerList of the company
      */
     public void setManagerList(ArrayList<Manager> m) {
    	 this.managerList = m;
     }
     
     		
}
