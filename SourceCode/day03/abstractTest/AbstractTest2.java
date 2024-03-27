package abstractTest;

public class AbstractTest2 {

	// 실습2.
	// 메소드 완성 : 매개변수, 중괄호 영역
	void getPhone(Phone phone) {
		// 스마트폰은 화면을 터치해서 문자를 보냅니다 출력
		// 폴더폰은 자판을 눌러서 문자를 보냅니다 출력
		phone.text();
		phone.call();
		phone.charge();

		// Phone에 들어올 수 있는 객체는 Phone을 완성시킨 phone의 자식클래스
		// 자식 클래스에서 추상메소드를 오버라이딩 했다면 다운캐스팅 안 해도 사용 가능
		// 오버라이딩을 했기 때문에 가능.
		// 따라서 아래처럼 쓰지 않는다.
//		if(SmartPhone) {
//			System.out.println("화면을 터치해서 문자를 보냅니다");
//		}else if() {
//			System.out.println("자판을 눌러서 문자를 보냅니다");
//		}
	}

	public static void main(String[] args) {

		// 실습1.
		// Phone 추상 클래스
		// void text() 추상메소드
		// void call() 추상메소드
		// void charge() 메소드 배터리를 교체 출력

		// SmartPhone 클래스(Phone 클래스 상속)
		// void text() 화면을 터치해서 문자를 보냅니다 출력
		// void call() 화면을 터치해서 전화를 겁니다 출력
		// void charge() 메소드 C타입 케이블로 충전 출력

		// FolderPhone 클래스(Phone 클래스 상속)
		// void text() 자판을 눌러서 문자를 보냅니다 출력
		// void call() 자판을 눌러서 전화를 겁니다 출력
		// void charge() 메소드 5핀 케이블로 충전 출력

		AbstractTest2 at = new AbstractTest2();

		// 직접 값을 전달
		// 매개변수로 전달되면서(넘겨주는 순간) 업캐스팅
		// Phone phone = new SmartPhone()
		at.getPhone(new SmartPhone());

		// 변수에 담아서 전달
		// 매개변수로 넘겨주는 순간 업캐스팅
		// Phone phone = smart = new SmartPhone()
		SmartPhone smart = new SmartPhone();
		at.getPhone(smart);

		// 변수에 담아서 전달
		// 업캐스팅 후 전달
		Phone phone = new SmartPhone();
		at.getPhone(phone);
		System.out.println();
		
		at.getPhone(new FolderPhone());
		System.out.println();	

	}

}
