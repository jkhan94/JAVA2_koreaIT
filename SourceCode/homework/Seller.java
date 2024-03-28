package homework;

public class Seller extends User {
	// 3. Buyer 클래스 (User 클래스를 상속받는다)

	// 필드
	// 판매자 번호 sellerNumber
	// 판매자명 sellerName
	int sellerNumber;
	String sellerName;

	// 생성자
	// 매개변수가 없는 생성자
	// String id, String pw, String name, String email, int sellerNumber, String
	// sellerName 를 매개변수로 받는 생성자
	// 상속받은 필드는 부모 생성자를 통해 초기화 한다
	public Seller() {
		super();
	}

	public Seller(String id, String pw, String name, String email, int sellerNumber, String sellerName) {
		super(id, pw, name, email);
		this.sellerNumber = sellerNumber;
		this.sellerName = sellerName;
	}

	// 메소드
	// 비밀번호 찾기 메소드 (아이디와 판매자 번호를 입력받아 기존의 정보와 일치하면 비밀번호를 출력)
	void findPw(String id, int sellerNumber) {
		if ((this.id).equals(id) && this.sellerNumber == sellerNumber) {
			System.out.println("\nSeller 비밀번호는 " + this.pw + " 입니다.");
		}
	}

	// 회원 정보 조회 메소드 (재정의하여 판매자명, 판매자번호도 출력한다)
	@Override
	void getData() {
		// 부모클래스의 getData() 함수 호출
//		super.getData();
		// 자식클래스에서 추가되는 부분만 재정의
		if (this.loginState) {
			System.out.println("\nSeller 회원 정보 출력");
			System.out.println("판매자명 : " + this.sellerName);
			System.out.println("판매자번호 : " + this.sellerNumber);
		} else if (!this.loginState) {
			System.out.println("\nSeller 로그인 상태가 아닙니다");
		}
	}

}
