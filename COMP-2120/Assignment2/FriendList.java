import java.util.ArrayList;
import java.util.Collections;
/*
 * The purpose of this class is to create an list of the friends
 */
public class FriendList {
	/*
	 * Arraylist of friends of type person
	 */
	public ArrayList<Person> friends = new ArrayList<Person>();
	public ArrayList<Person> copyOffriends = friends;
/*
 * Default Constructor
 */
	public FriendList() {
		;
	}
	/*
	 * Method to add new friend
	 * @param newFriend is a friend of type Person
	 */
	public void addFriend(Person newFriend) {
		friends.add(newFriend);
	}
	/*
	 * Method to delete the friend
	 * @param friend is to remove the friend
	 */
	public void deleteFriend(Person friend) {
		friends.remove(friend);
	}
	
	public void deleteByFirstname(String firstname) {
		if(friends.contains(firstname)) {
		friends.remove(friends);
		}
	}
	
	/*
	 * Method to sort the names by Last Name 
	 */
	public ArrayList<String> sortedByLastname(){	
	ArrayList<String> lastName = new ArrayList<String>();
	 for(Person friends : this.friends ) {
		 lastName.add(friends.getLastName());
		 
	 }
	 Collections.sort(lastName);
	 for(String name: lastName) {
		 for(Person friend : this.friends) {
			 if(name.equals(friend.getLastName())) {
				 System.out.println(friend.toString());
			 }
		 }
	 }
	 return lastName;
	 
	}
	
	/*
	 * Method to get the number of friends
	 */
	public int NumOfFriends() {
		return friends.size();
	}
	
	/*
	 * Method to sort the list by Birthday Month
	 */
	public ArrayList<String> sortedbyMonth(int birthMonth){
		ArrayList<String> birthDay = new ArrayList<String>();
		for(Person friends : this.friends) {
			if(friends.getBirthMonth() == birthMonth) {
				birthDay.add(friends.getFirstName());
				
			}
		}
		Collections.sort(birthDay);
		for(Person friends : this.friends) {
			if(friends.getBirthMonth() == birthMonth) {
			 System.out.println(friends.toString());
				//System.out.println(friends.getFirstName() + " "+ friends.getLastName()+ " has BirthDay Month: " + friends.getBirthMonth());
		}
		}
		return birthDay;
	}
	
	/*
	 * Method to sort the list by BirthDay
	 */
	public ArrayList<String> sortedbyDay(int birthMonth,int birthDay){
		ArrayList<String> friend = new ArrayList<String>();
		for(Person friends : this.friends) {
			if((friends.getBirthDay()==birthDay) && (friends.getBirthMonth() == birthMonth)) {
				friend.add(friends.getLastName());
			}
		}
		Collections.sort(friend);
		for(Person friends : this.friends) {
			if((friends.getBirthDay()==birthDay) && (friends.getBirthMonth() == birthMonth)) {
			//System.out.println(friends.getFirstName() + " "+ friends.getLastName()+ " has BirthDay on : " + friends.getBirthDay());
				System.out.println(friends.toString());
			}
		}
		return friend;
	}
	
	/*
	 * Method to get friends phone number
	 */
	public String getFriendsNumber(String firstName,String lastName) {
			for(Person friends : this.friends) {
				if(friends.getFirstName().equals(firstName)) {
					
					return "Name: "+ friends.getFirstName() +" "+ friends.getLastName()+ " cell no. : " +friends.getCellNumber();
				}
			}
		
		return firstName + " " +lastName + " has no cell number.";
	}
	
	/*
	 * Method to printFriend list
	 */
	public void printfriendList(){	
		
		 for(Person friend: this.friends ) {
			 System.out.println(friend.toString());
		 }
		 
		}
		
	
	
}
