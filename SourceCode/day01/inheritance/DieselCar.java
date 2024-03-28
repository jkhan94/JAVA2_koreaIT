package inheritance;

// extends 부모클래스
public class DieselCar extends Car {
	// 필드
	int maxOil;
	int currentOil;

	// 생성자
	// 생성자에선 리턴값을 줄 수 없다.
	public DieselCar() {
		super(); // Car() 호출
		System.out.println("DieselCar 생성자1 호출!");
	}

	public DieselCar(int maxOil, int currentOil) {
		super();
		this.maxOil = maxOil;
		this.currentOil = currentOil;
		System.out.println("DieselCar 생성자2 호출!");
	}

	// 메소드
	void getCurrentOil() {
		// 전역변수
		System.out.println("현재 주유량 = " + currentOil);

		// 지역변수
		int num = 10;
	}
	// 지역변수는 다른 메소드에서 호출하지 못한다
//	void method() {		
//		System.out.println(num);
//	}

}
