package homework;

public class User {
	// 1. User 클래스

	// 필드
	// 아이디 id
	// 비밀번호 pw
	// 이름 name
	// 이메일 주소 email
	// 로그인 상태 loginState
	String id;
	String pw;
	String name;
	String email;
	// boolean형 디폴트값은 false
	// 명시적 초기화는 디폴트가 아닌 값으로 초기화 할 떄 사용
	boolean loginState;
//	boolean loginState = false;

	// 생성자
	// 매개변수가 없는 생성자
	// String id, String pw, String name, String email 를 매개변수로 받는 생성자
	public User() {
		super();
	}

	public User(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	// 메소드
	// 로그인 메소드 (아이디와 비밀번호를 입력받아 기존 아이디와 비밀번호와 일치하면 로그인 성공, 아니면 로그인 실패 출력, 로그인 성공시
	// loginState 값을 true로 변경)
	void login(String id, String pw) {
		if ((this.id).equals(id) && this.pw == pw) {
			System.out.println("로그인 성공");
			this.loginState = true;
		} else {
			System.out.println("로그인 실패");
		}
	}

	// 로그아웃 메소드 (loginState 가 true 일 경우 false로 변경후 안녕히 가세요 출력, false일 경우 로그인 상태가
	void logout() {
		// this.loginState == true는 쓰지 않음
		// this.loginState는 boolean형으로 
		// 참일 때는 this.loginState
		// 거짓일 때는 !this.loginState으로 사용하는 게 보편적
		if (this.loginState) {
			this.loginState = false;
			System.out.println("안녕히 가세요");
		} else if (this.loginState == false) {
			System.out.println("로그인 상태가 아닙니다");
		}
	}

	// 회원 정보 조회 메소드 (loginState 값이 true 일 경우 가입된 정보를 출력, false일 경우 로그인 상태가 아닙니다 출력)
	void getData() {
		if (this.loginState == true) {
			System.out.println("회원 정보 출력");
			System.out.println("ID : " + this.id);
			System.out.println("이름 : " + this.name);
			System.out.println("이메일 주소 : " + this.email);
		} else if (this.loginState == false) {
			System.out.println("로그인 상태가 아닙니다");
		}
	}

}
