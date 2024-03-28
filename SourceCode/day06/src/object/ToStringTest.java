package object;

public class ToStringTest {

	public static void main(String[] args) {

		// Object class의 toString()
		// 클래스 경로.클래스명 + @16진수로 변환된 해시코드
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		User user = new User(1, "min");
		System.out.println(user);
		System.out.println(user.toString());

		// 재정의 한 toString()
		// userName이 출력되게 변경
		NewUser newUser = new NewUser(1, "min");
		System.out.println(newUser);
		System.out.println(newUser.toString());
	}

}
