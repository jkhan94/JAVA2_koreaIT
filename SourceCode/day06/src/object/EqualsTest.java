package object;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EqualsTest {

	public static void main(String[] args) {

		User user1 = new User(1, "kim");
		User user2 = new User(1, "kim");

		System.out.println("user1: " + user1);
		System.out.println("user2: " + user2);
		System.out.println(user1 == user2);
		System.out.println(user1 == user1);
		// 주소 비교
		System.out.println(user1.equals(user2));
		System.out.println();

		String msg = "hello";
		String msg2 = "hello";
		String msg3 = "HELLO";
		String msg4 = new String("hello");

		System.out.println("msg: " + msg);
		System.out.println("msg2: " + msg2);
		System.out.println("msg3: " + msg3);
		System.out.println("msg4: " + msg4);
		System.out.println(msg == msg2); // hello = hello
		System.out.println(msg == msg3); // hello = Hello
		System.out.println(msg == msg4); // msg 주소 = msg4 주소
		System.out.println(msg.equals(msg2)); // hello = hello
		System.out.println(msg.equals(msg3)); // hello = Hello
		System.out.println(msg.equals(msg4)); // hello = hello
		System.out.println();

		NewUser newUser1 = new NewUser(1, "kim");
		NewUser newUser2 = new NewUser(1, "kim");
		System.out.println("newUser1: " + newUser1);
		System.out.println("newUser1 identityHashCode(주소): " + Integer.toHexString(System.identityHashCode(newUser1)));
		System.out.println("newUser1 hashCode: " + newUser1.hashCode());
		System.out.println();
		
		System.out.println("newUser2: " + newUser2);
		System.out.println("newUser2 identityHashCode(주소): " + Integer.toHexString(System.identityHashCode(newUser2)));
		System.out.println("newUser2 hashCode: " + newUser2.hashCode());
		// 주소 비교
		System.out.println(newUser1 == newUser2);
		// 이름 문자열 비교
		System.out.println(newUser1.equals(newUser2));

	}

}
