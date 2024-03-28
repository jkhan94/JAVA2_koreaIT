package object;

public class HashCodeTest {

	public static void main(String[] args) {

		// object 클래스의 hashCode()
		User user1 = new User(1, "kim");
		User user2 = new User(1, "kim");
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println();

		// NewUser에서 재정의한 해시코드
		// 보통 인수 값이 같으면 hashCode도 동일하다.
		// 그런데 서로 다른 객체이므로 메모리의 주소는 서로 다르다.
		NewUser newUser1 = new NewUser(1, "kim");
		NewUser newUser2 = new NewUser(1, "kim");		
		System.out.println(newUser1.hashCode());
		System.out.println(newUser2.hashCode());
		System.out.println();
		
		NewUser newUser3 = new NewUser(1, "long");
		NewUser newUser4 = new NewUser(2, "kim");		
		System.out.println(newUser3.hashCode());
		System.out.println(newUser4.hashCode());

	}

}
