package abstractTest;

public class SmartPhone extends Phone {
	// SmartPhone 클래스(Phone 클래스 상송)
	// void text() 화면을 터치해서 문자를 보냅니다 출력
	// void call() 화면을 터치해서 전화를 겁니다 출력
	// void charge() 메소드 C타입 케이블로 충전 출력

	@Override
	void text() {
		System.out.println("화면을 터치해서 문자를 보냅니다");
	}

	@Override
	void call() {
		System.out.println("화면을 터치해서 전화를 겁니다");
	}

	// charge도 재정의하는 함수
	// 따라서 어노테이션 필요 -> alt + shift + s + v
	@Override
	void charge() {
		System.out.println("C타입 케이블로 충전");
	}

}
