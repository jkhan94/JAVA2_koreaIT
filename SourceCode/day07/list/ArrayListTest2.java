package list;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<>();
		User user1 = new User("kim", "kim1234");
		User user2 = new User("long", "long4321");
		User user3 = new User();
		
		System.out.println(userList);
		
		userList.add(user1);
		userList.add(0,user2);
		userList.add(user3);
		System.out.println(userList);
		System.out.println();
		
		System.out.println("size: "+userList.size());
		System.out.println(userList.contains(user2));
		System.out.println();
		
		userList.set(1, null);
		System.out.println(userList);
		System.out.println(userList.contains(user1));
		System.out.println();
		
		userList.remove(0);
		System.out.println(userList);
		userList.remove(0);
		System.out.println(userList);
		
		userList.add(user3);
		System.out.println(userList);

	}

}
