

public class TestPerson {

	private static final Person NULL = null;

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person("Luke");
		Person person4 = new Person("Swara",1);

		person1.setName("Dhwani");
		person1.setAge(19);
		person2.setName("Riya");
		person2.setAge(20);
		person3.setAge(64);
		System.out.printf("Actual: %s is %d years old.\n",person1.getName(),person1.getAge());
		System.out.println("Expected: Dhwani is 19 years old\n");
		System.out.printf("Actual: %s is %d years old.\n",person2.getName(),person2.getAge());
		System.out.println("Expected: Riya is 20 years old\n");
		System.out.printf("Actual: %s is %d years old.\n",person3.getName(),person3.getAge());
		System.out.println("Expected: Luke is 64 years old\n");
		System.out.printf("Actual: %s is %d year old.\n",person4.getName(),person4.getAge());
		System.out.println("Expected: Swara is 1 year old\n");
		
		person1.talk("Hello! Hope all are doing well.");
		System.out.println("Expected: Dhwani is saying Hello! Hope all are doing well.\n");
		person3.talk("Hi! I am sick nowadays");
		System.out.println("Expected: Luke is saying Hi! I am sick nowadays.\n");
		person4.talk("Apple");
		System.out.println("Expected: Swara is saying Apple\n");
		
		person1.person_eats("Pizza");
		System.out.println("Expected: Dhwani is eating Pizza\n");
		person2.person_eats("Burger and fries");
		System.out.println("Expected: Riya is eating Burger and fries\n");
		person4.person_eats("Milk");	
		System.out.println("Expected: Swara is not able to talk as she is too young.\n");
		person1.person_eats("Strawberries");
		System.out.println("Expected: Dhwani already ate food and is full,so she cant eat strawberries now.\n");
		
		person2.needFood("Sandwich");
		System.out.println("Expected: Dhwani is Hungry to fill her stomach with Sandwhich.\n");
		person4.needFood("Juice");
		System.out.println("Expected: Swara is Hungry to fill her stomach with Juice.\n");
		
		person1.walk(1075.98);
		System.out.println("Expected: Dhwani has walked 1075.98 distance recently and had walked 1075.98 distance so far\n");
		person2.walk(340.0);
		System.out.println("Expected: Riya has walked 340.00 distance recently and had walked 340.00 distance so far.\n");
		person3.walk(450.55);
		System.out.println("Expected: Luke has walked 450.55 distance recently and had walked 450.55 distance so far.\n");
		person1.walk(340.63);
		System.out.println("Expected: Dhwani has walked 340.63 distance recently and had walked 1416.61 distance so far.\n");
		
		person4.sleep();
		System.out.println("Expected: Swara just sleept now so she will be fresh and no more tired when wake ups.\n");
		person3.sleep();
		System.out.println("Expected: Luke just sleept now so she will be fresh and no more tired when wake ups.\n");
		person2.sleep();
		System.out.println("Expected: Riya just sleept now so she will be fresh and no more tired when wake ups.\n");
		person4.sleep();
		System.out.println("Expected: Swara is still sleeping and not awake so he cannot walk.\n");
		
		person2.awake();
		person3.awake();
		
		person1.grow();
		System.out.println("Expected: Dhwani is now 20 years old.\n");
		person2.grow();
		System.out.println("Expected: Riya is now 21 years old.\n");
		person3.grow();
		System.out.println("Expected:Luke is getting old and is 65 now, also his walking capability is decreased and can only walk 1000.00 meters maximum.\n ");
		
		person2.setFriend(person1);
		person2.getFriend();
		String person2Friend = person2.getFriend().getName();
		if(person2Friend == " ") {
			System.out.printf("%s has noone as her friend\n",person2.getName());
		}
		else {
			System.out.printf("%s has a friend whose name is %s\n",person2.getName(), person2.getFriend().getName());
		}
		System.out.println("Expected: Riya has friend named with Dhwani.\n");
		person2.changeFriend(person3);
		System.out.printf("Actual: %s is friend of %s.\n",person2.getName(),person2.getFriend().getName());
		System.out.println("Expected: Riya is friend of Luke.\n");
		
		
		
		
	}

}
