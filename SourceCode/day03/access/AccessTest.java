package access;

public class AccessTest {

	public static void main(String[] args) {

		User user1 = new User("kimkim", "kim1234", "김길동");
		// getter 사용
		System.out.println(user1.isAdmin());

		// 잘못된 값이 들어오지 않도록 setter에 private을 붙여서 방지한다
		// 특정 조건을 만족하면 생성자에서 isAdmin을 true로 초기화한다
		User user2 = new User("admin", "admin1234", "관리자");
		System.out.println(user2.isAdmin());
	}

}
