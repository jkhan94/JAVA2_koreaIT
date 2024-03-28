package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import list.User;

public class HashMapTest2 {

	public static void main(String[] args) {

		User user1 = new User("kim", "kim1234");
		User user2 = new User("hong", "hong1234");

		HashMap<Integer, User> userList = new HashMap<>();

		userList.put(1, user1);
		userList.put(2, user2);
		System.out.println(userList);
		System.out.println(userList.get(1));
		System.out.println(userList.get(1).id);
		System.out.println();

		Iterator<Entry<Integer, User>> iter = userList.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer, User> entry = iter.next();
			System.out.print("key = " + entry.getKey() + ", ");
			System.out.println("value = " + entry.getValue());
		}

	}

}
