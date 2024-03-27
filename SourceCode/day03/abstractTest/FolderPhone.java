package abstractTest;

public class FolderPhone extends Phone {

	// FolderPhone 클래스(Phone 클래스 상속)\
	// void text() 자판을 눌러서 문자를 보냅니다 출력
	// void call() 자판을 눌러서 전화를 겁니다 출력
	// void charge() 메소드 5핀 케이블로 충전 출력
	
	@Override
	void text() {
		System.out.println("자판을 눌러서 문자를 보냅니다");
	}

	@Override
	void call() {
		System.out.println("자판을 눌러서 전화를 겁니다");
	}

	@Override
	void charge() {
		// 부모클래스에 charge가 정의되어 있으므로 super로 불러올 수 있다.
		// text, call은 추상메소드라 정의되어 있는 내용이 없어 super로 불러올 게 없다.
//		 super.charge();
		System.out.println("5핀 케이블로 충전");
		super.charge();
	}
}
