package homework;

public class Buyer extends User {
	// 2. Seller 클래스 (User 클래스를 상속받는다)

	// 필드
	// 주소 address
	String address;

	// 생성자
	// 매개변수가 없는 생성자
	// String id, String pw, String name, String email, String address 를 매개변수로 받는
	// 생성자
	// 상속받은 필드는 부모 생성자를 통해 초기화 한다
	public Buyer() {
		super();
	}

	public Buyer(String id, String pw, String name, String email, String address) {
		super(id, pw, name, email);
		this.address = address;
	}

	// 메소드
	// 비밀번호 찾기 메소드 (아이디를 입력받아 기존 아이디와 일치하면 비밀번호 출력)
	void findPw(String id) {
		if ((this.id).equals(id)) {
			System.out.println("\nBuyer 비밀번호는 " + this.pw + " 입니다.");
		}
	}

	// 회원 정보 조회 메소드 (재정의하여 주소도 출력한다)
	// alt + shift + s + v
	@Override
	void getData() {
		// 부모클래스의 getData를 쓰지 않음
//		super.getData();
		// 자식ㅋ클래스에서 전부 재정의
		if (this.loginState) {
			System.out.println("\nBuyer 회원 정보 출력");
			System.out.println("ID : " + this.id);
			System.out.println("이름 : " + this.name);
			System.out.println("이메일 주소 : " + this.email);
			System.out.println("주소 : " + this.address);
		} else if (!this.loginState) {
			System.out.println("\nBuyer 로그인 상태가 아닙니다");
		}
	}

}
