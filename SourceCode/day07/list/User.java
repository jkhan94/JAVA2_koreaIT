package list;

import java.util.ArrayList;

public class User {

	public String id;
	public String pw;
	
	public User() {
		super();
	}

	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	// alt + shift + s + s
	// toString 메소드를 바로 재정의
	// alt + shift + s + v로 오버라이딩해도 됨
	// s와 v의 차이는 출력 형태
	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}

}
