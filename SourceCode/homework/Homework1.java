// 요구사항에 맞추어 어떻게 설계를 하고 코드를 작성할 것인가가 포인트인 문제였습니다
package homework;

public class Homework1 {

	// 아래의 메소드를 완성시키세요 (매개변수, 실행할 코드)
	void method1(User user) {
		// 로그인 메소드 사용
		user.login(user.id, user.pw);
	}

	void method2(User user) {
		// 회원 정보 조회 메소드 사용
		user.getData();
	}

	void method3(User user) {
		// 비밀번호 찾기 메소드 사용
		if (user instanceof Buyer) {
			((Buyer) user).findPw(user.id);
		} else if (user instanceof Seller) {
			((Seller) user).findPw(user.id, ((Seller) user).sellerNumber);
		}

	}

//	void method1(Buyer buyer, Seller seller) {
//		// 로그인 메소드 사용
//		if (buyer != null) {
//			buyer.login(buyer.id, buyer.pw);
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//		if (seller != null) {
//			seller.login(seller.id, seller.pw);
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//	}
//
//	void method2(Buyer buyer, Seller seller) {
//		// 회원 정보 조회 메소드 사용
//		if (buyer != null) {
//			buyer.getData();
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//		if (seller != null) {
//			seller.getData();
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//	}
//
//	void method3(Buyer buyer, Seller seller) {
//		// 비밀번호 찾기 메소드 사용
//		if (buyer != null) {
//			buyer.findPw(buyer.id);
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//		if (seller != null) {
//			seller.findPw(seller.id, seller.sellerNumber);
//		} else {
//			System.out.println("아이디와 비밀번호를 제대로 입력해주세요!");
//		}
//	}

	public static void main(String[] args) {

		// 1. User 클래스

		// 필드
		// 아이디 id
		// 비밀번호 pw
		// 이름 name
		// 이메일 주소 email
		// 로그인 상태 loginState

		// 생성자
		// 매개변수가 없는 생성자
		// String id, String pw, String name, String email 를 매개변수로 받는 생성자

		// 메소드
		// 로그인 메소드 (아이디와 비밀번호를 입력받아 기존 아이디와 비밀번호와 일치하면 로그인 성공, 아니면 로그인 실패 출력, 로그인 성공시
		// loginState 값을 true로 변경)
		// 로그아웃 메소드 (loginState 가 true 일 경우 false로 변경후 안녕히 가세요 출력, false일 경우 로그인 상태가
		// 회원 정보 조회 메소드 (loginState 값이 true 일 경우 가입된 정보를 출력, false일 경우 로그인 상태가 아닙니다 출력)

		// 2. Buyer 클래스 (User 클래스를 상속받는다)

		// 필드
		// 주소 address

		// 생성자
		// 매개변수가 없는 생성자
		// String id, String pw, String name, String email, String address 를 매개변수로 받는
		// 생성자
		// 상속받은 필드는 부모 생성자를 통해 초기화 한다

		// 메소드
		// 비밀번호 찾기 메소드 (아이디를 입력받아 기존 아이디와 일치하면 비밀번호 출력)
		// 회원 정보 조회 메소드 (재정의하여 주소도 출력한다)

		// 3. Seller 클래스 (User 클래스를 상속받는다)

		// 필드
		// 판매자 번호 sellerNumber
		// 판매자명 sellerName

		// 생성자
		// 매개변수가 없는 생성자
		// String id, String pw, String name, String email, int sellerNumber, String
		// sellerName 를 매개변수로 받는 생성자
		// 상속받은 필드는 부모 생성자를 통해 초기화 한다

		// 메소드
		// 비밀번호 찾기 메소드 (아이디와 판매자 번호를 입력받아 기존의 정보와 일치하면 비밀번호를 출력)
		// 회원 정보 조회 메소드 (재정의하여 판매자명, 판매자번호도 출력한다)

		Homework1 hw = new Homework1();
		// Buyer, Seller 클래스명이 서로 바뀐 것 같아 변경했습니다.
		Buyer buyer = new Buyer("user1", "user1", "b1234", "b1234@b1234.com", "서울시 강남구 역삼동");
		Seller seller = new Seller("user2", "user2", "s1234", "s1234@b1234.com", 1, "자바상점");

		hw.method1(buyer);
		hw.method2(buyer);
		hw.method3(buyer);
		
		System.out.println("\n///////\n");
		
		hw.method1(seller);
		hw.method2(seller);
		hw.method3(seller);

	}

}
