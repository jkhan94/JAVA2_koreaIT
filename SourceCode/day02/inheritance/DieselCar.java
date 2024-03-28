package inheritance;

// 자식클래스 extends 부모클래스
public class DieselCar extends Car {

	// 필드
	int maxOil;
	int currentOil;

	// 생성자
	public DieselCar() {
		// String color, int price, int seats, boolean isSuv
		// 하나로 고정해서 사용
		super("red", 10000, 5, true); // 물려받은 것부터 초기화
		System.out.println("DieselCar 생성자1 호출!");
	}

	public DieselCar(String color, int price, int seats, boolean isSuv, int maxOil, int currentOil) {
		super(color, price, seats, isSuv);
		this.maxOil = maxOil;
		this.currentOil = currentOil;
		System.out.println("DieselCar 생성자2 호출!");
	}

	// 부모의 필드를 이용한 생성자 자동완성
	// alt + shift + s + c (generate constructors from superclass)
	// 앞 4개는 부모필드 초기화, 뒤 2개는 본인 초기화
	// 객체화 할 때마다 다르게 사용
	public DieselCar(String color, int price, int seats, boolean isSuv) {
		super(color, price, seats, isSuv);
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
		// 지역 변수
//      int num = 10;
	}

	void method() {
		// 지역변수는 다른 메소드에서 호출하지 못한다
//      System.out.println(num);
	}

	// 메소드 오버라이딩 (자동완성 단축키 ctrl + space, alt + shift + s + v)
	// 자동완성 override in 부모클래스명
	// alt + shift + s + v(Override/Implement Method)
	// 사용가능한 것들이 뜨며, 이미 만든 건 목록에 안 뜸.
	@Override // 어노테이션
	void turnOn() {
		// 부모의 메소드의 내용을 수정해서 오버라이딩
		System.out.println("경유차의 시동을 킵니다");

		// 부모의 메소드에 내용을 추가해서 오버라이딩
//      super.turnOn();
//      System.out.println("경유차입니다");		
	}

	// 주유 메소드
	void fillUP(int oilNum) {
		// 만약 입력한 주유량이 최대 주유량보다 크다면 최대 주유량만큼 주유
		// 입력한 주유량이 0 또는 음수라면 정확한 주유량을 입력하세요 출력
		// 입력한 주유량과 현재 주유량의 합계가 최대 주유량보다 크면 최대 주유량 주유
		// 그외는 정상적인 주유
//		if (oilNum <= 0) {
//			System.out.println("정확한 주유량을 입력하세요!");
//		} else {
//			if (oilNum > maxOil) {
//				currentOil = maxOil;
//			} else if (oilNum + currentOil > maxOil) {
//				currentOil = maxOil;
//			} else {
//				currentOil = currentOil + oilNum;
//			}
//		}

		// 모범답안
		if (oilNum >= maxOil) {
			currentOil = maxOil;
		} else if (oilNum <= 0) {
			System.out.println("정확한 주유량을 입력하세요!");
		} else if ((oilNum + currentOil) >= maxOil) {
			currentOil = maxOil;
		} else {
			currentOil += oilNum;
		}
	}

}