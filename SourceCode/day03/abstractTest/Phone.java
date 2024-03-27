package abstractTest;

public abstract class Phone {
	// Phone 추상 클래스
	// void text() 추상메소드
	// void call() 추상메소드
	// void charge() 메소드 배터리를 교체 출력

	abstract void text();

	abstract void call();

	void charge() {
		System.out.println("배터리를 교체");
	}

}
