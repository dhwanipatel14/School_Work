import java.util.ArrayList;
import java.util.Collections;

public class MyCompany {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Katliyan", "Plante", 5, 17);
		Employee employee2 = new Employee("Andrew", "Sewman", 7, 12, 2011, 55000);
		Employee employee3 = new Employee("Shelsha", "Shah", 3, 30, 2014, 42000);
		Employee employee4 = new Employee("Ross", "Angula", 10, 9, 2005, 75500);
		Manager manager1 = new Manager("Dhwani", "Patel", 11, 19, 1200.96);
		Manager manager2 = new Manager("John", "Sharma", 11, 6, 700);

		ArrayList<Employee> employeList = new ArrayList<>();
		employeList.add(employee1);
		employeList.add(employee2);
		employeList.add(employee3);
		employeList.add(employee4);
		ArrayList<Manager> managerList = new ArrayList<Manager>();
		managerList.add(manager1);
		managerList.add(manager2);

		manager1.setEmployeeList(employee1);
		manager1.setEmployeeList(employee2);
		manager2.setEmployeeList(employee3);
		manager2.setEmployeeList(employee4);
		

		Company company1 = new Company("Micheal Korgs", 2001);
		System.out.println("Company: " + company1.getName() + " established in " + company1.getYear() + ".\n");
		company1.setEmployeeList(employeList);
		System.out.println("List of Employees: ");
		for (Employee employee : employeList) {
			System.out.println(employee.toString());
		}
		System.out.println();
		company1.setManagerList(managerList);
		System.out.println("List of Managers: ");
		for (Manager manager : managerList) {
			System.out.println(manager.toString());
		}
		System.out.println();

		ArrayList<String> myList = new ArrayList<String>();
		for (Employee person1 : employeList) {
			myList.add(person1.getLastName());
		}
		for (Manager person2 : managerList) {
			myList.add(person2.getLastName());
		}
		Collections.sort(myList);
		System.out.println("\nEmployee sorted by lastname");
		for (String person : myList) {
			for (Person employee : employeList) {
				if (person.equals(employee.getLastName()))
					System.out.println(employee.toString());
			}
		}
		System.out.println("\nManagers sorted by lastname");
		for (String person : myList) {			
			for (Person manager : managerList) {
				if (person.equals(manager.getLastName()))
					System.out.println(manager.toString());
			}
		}
		System.out.println("\nEmployee sorted by thier Mangers: ");
		for(Manager m : managerList) {
			System.out.println("Manager: " + m.toString());
			System.out.println("Employees: "+ m.getEmployeeList());
			System.out.println();
		}

	}

}
