/*
 * The purpose of this Person class is to deal with different human activities done in daily life.
 */
public class Person {
	private String name;
	private int age;
	private double walking_distance;
	private static final int MAX_WALKING_DIST = 4000;
	private double walking_Capability;;
	private Person friend;
	private enum Eat_Status {
		HUNGRY, FULL
	};
	private Eat_Status food_status;;
	private enum Sleep_Status {
		SLEEP, AWAKE
	};
	private Sleep_Status person_sleeps;
	
	/*
	 * This is default constructor of class Person.
	 */
	public Person() {
		this.name = " ";
		this.walking_distance = 0.0;
		this.food_status= Eat_Status.HUNGRY;
		this.person_sleeps = Sleep_Status.AWAKE;
		this.walking_Capability = MAX_WALKING_DIST;
	}
	/*
	 * This is second Construct with 
	 * @param name Name of the person
	 */
	public Person(String name) {
		this.name = name;
		this.walking_distance = 0.0;
		this.food_status= Eat_Status.HUNGRY;
		this.person_sleeps = Sleep_Status.AWAKE;
		this.walking_Capability = MAX_WALKING_DIST;
	
	}
	/*
	 * The third constructor with
	 * @param name Name of the person
	 * @param age Age of the person
	 */
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
		this.walking_distance = 0.0;
		this.food_status= Eat_Status.HUNGRY;
		this.person_sleeps = Sleep_Status.AWAKE;
		this.walking_Capability = MAX_WALKING_DIST;
	
	}
	
	/*
	 * Accessor method to get name of person
	 */
	public String getName() {
		return this.name;
	}
	/*
	 * @param name Sets new name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Accessor method to get age of the person
	 */
	public int getAge() {
		return this.age;
	}
	/*
	 * @param age Sets new age of the person
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * Accessor method to get distance walked by a person.
	 */
	public double getWalkingDistance(double walking_distance) {
		return this.walking_distance;
	}
	/*
	 * @param walking_distance SETS new walking distance of person
	 */
	public void setWalkingDistance(double walking_distance) {
		this.walking_distance = walking_distance;
	}
	/*
	 * Accessor method to get walking capability
	 */
	public double getWalkingCapability() {
		return this.walking_Capability;
	}
	/*
	 * @param p_talk says what person is talking.
	 */
	public void talk(String p_talk) {
		if (age > 2) {
			System.out.printf("%s is saying that %s\n", this.name, p_talk);
		} else {
			System.out.printf("%s is not able to talk as she is too young.\n", this.name);
		}
	}
	/*
	 * Accessor method that returns food_status of person
	 */
	public Eat_Status getFoodStatus() {
		return this.food_status;
	}
	/*
	 * @param food_status SETS food status HUNGRY or FULL
	 */
	public void setFoodStatus(Eat_Status food_status) {
		this.food_status = food_status;
	}
	/*
	 * @param food is used to get what person is eating.
	 * This method checks if person already had food and acts vicecersa.
	 */
	public void person_eats(String food) {
		if (this.food_status == Eat_Status.HUNGRY) {
			System.out.printf("%s is eating %s\n", this.name, food);
			this.food_status = Eat_Status.FULL;
		}
		else {
			System.out.printf("%s has already ate food and is full ,so cant eat %s now.\n",this.name,food);
		}
	}
	/*
	 *@param food to eat and this method change foodstatus of person 
	 */
	public void needFood(String food) {
		if (this.food_status == Eat_Status.FULL) {
			this.food_status = Eat_Status.HUNGRY;
			System.out.printf("%s is now Hungry to fill his stomach with %s.\n", this.name,food);
		}
	}
	/*
	 * Accessor method to get sleep status.
	 */
	public Sleep_Status getSleepStatus() {
		return this.person_sleeps;
	}
	/*
	 * @param person_sleeps to know if person is sleeping or not.
	 */
	public void setSleepStatus(Sleep_Status person_sleeps) {
		this.person_sleeps = person_sleeps;
	}
	/*
	 * @param distance to know how much person has walked.
	 */
	public void walk(double distance) {
		if (this.person_sleeps == Sleep_Status.AWAKE) {
			if (walking_distance > MAX_WALKING_DIST) {
				System.out.printf("%s has walked %f distance meters so he is now tired \n", this.name,
						walking_distance);
			} else {
				this.walking_distance = walking_distance + distance;
				System.out.printf("%s has walked %.2f distance recently and had walked %.2f distance so far.\n", this.name,
						distance, walking_distance);
			}
		} else {
			System.out.println(this.name + " is sleeping so she cannot walk now.");
		}

	}
	/*
	 * Method to change sleeping status of person.
	 */
	public void sleep() {
		if (this.person_sleeps == Sleep_Status.AWAKE) {
			person_sleeps = Sleep_Status.SLEEP;
			walking_distance = 0.0;
			System.out.println(this.name + " just sleept now so she will be fresh and no more tired when wake ups.");

		} else {
			System.out.println(this.name + " is still sleeping and not awake so he cannot walk.");
		}
	}
	/*
	 * Method to wake up the person
	 */
	public void awake() {
		if (this.person_sleeps == Sleep_Status.AWAKE) {
			setSleepStatus(Sleep_Status.AWAKE);
		}
	}
	/*
	 * Method to increase age of the person.
	 */
	public void grow() {
		if(this.age < 55) {
			this.age++;
			System.out.println(this.name + " is now " + this.age + " years old.");
		}
		else {
			this.age++;
			if((age%5) == 0) {
			this.walking_Capability = MAX_WALKING_DIST /(2 * ( (age - 55)/ 5));
			}
			System.out.printf("%s is getting old and is %d now, also his walking capability is decreased and can only walk %.2f meters maximum.\n",this.name,age,walking_Capability);
		}
	}
	/*
	 * Method to get friend of th person.
	 */
	public Person getFriend() {
		return this.friend;
	}
	/*
	 * @param new_friend is to set friend 
	 */
	public void setFriend(Person new_friend) {
		this.friend = new_friend;
		new_friend.friend = this.friend;
	}
	/*
	 * Method to change friend of person.
	 */
	public void changeFriend(Person friend) {
		this.setFriend(friend);
	}
	
	

}
