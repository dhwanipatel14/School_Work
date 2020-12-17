import java.util.ArrayList;

public class MyFriends {

	public static void main(String[] args) {
		
 		Person person1 = new Person("Dhwani","Patel");
		Person person2 = new Person("Ryan","Firamin");
		Person person3 = new Person("Shane","Allen");
		Person person4 = new Person("Swara","Ghosh");
		Person person5 = new Person("Aman","Patel",11,19,"265-678-9434");
		Person person6 = new Person("Sulley","Macarnama",11,28,"456-345-5676");
		Person person7 = new Person("Ishan","Macvana",11,21,"876-987-6754");
		Person person8 = new Person("Jullien","Dube",4,6,"654-897-9871");
		Person person9 = new Person("Vatsal","Sharma",11,3,"897-987-453");
		Person person10 = new Person("Felvina","Khunt",9,7,"676-980-2341");
		
		person1.setBirthDay(19);
		person1.setBirthMonth(11);
		person2.setBirthDay(30);
		person2.setBirthMonth(9);
		
		FriendList myfriendList = new FriendList();
		myfriendList.addFriend(person1);
		myfriendList.addFriend(person2);
		myfriendList.addFriend(person3);
		myfriendList.addFriend(person4);
		myfriendList.addFriend(person5);
		myfriendList.addFriend(person6);
		myfriendList.addFriend(person7);
		myfriendList.addFriend(person8);
		myfriendList.addFriend(person9);
		myfriendList.addFriend(person10);
		myfriendList.deleteFriend(person3);
		myfriendList.deleteFriend(person9);
		myfriendList.addFriend(person3);
		
		person1.setCellNumber("226-975-9876");
		person2.setCellNumber("345-987-6785");
		
		System.out.println("*************************************");
		myfriendList.printfriendList();
		System.out.println("*************************************\n");
		System.out.println("FriendList sorted by Month: ");
		System.out.println("*************************************");
		myfriendList.sortedbyMonth(11);

		System.out.println("*************************************\n");
		System.out.println("FriendList sorted by BirthDay: ");
		System.out.println("*************************************");
		myfriendList.sortedbyDay(11,19);
		System.out.println("*************************************\n");
		
		
		System.out.println("To get Number of friend.");
		System.out.println(myfriendList.getFriendsNumber("Dhwani", "Patel"));
		System.out.println();
		
		FriendList copyOfFriends = myfriendList;
		copyOfFriends.deleteByFirstname("Shane");;
		
		
		
	}
	
	

}
