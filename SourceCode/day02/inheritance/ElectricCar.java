package inheritance;

public class ElectricCar extends Car {
	// 필드 (최대 충전량 maxCharge, 현재 충전량 currentCharge)
	int maxCharge;
	int currentCharge;

	// 생성자
	// 생성자1 -> 매개변수 x
	// 생성자2 -> 모든 필드를 초기화(부모 필드는 부모생성자가 초기화한다)
	// 매개변수 6개
	public ElectricCar() {	
		// super() 생략해도 됨.
		System.out.println("ElectricCar 생성자1 호출!");
	}

//	public ElectricCar() {
//		super();
//		System.out.println("ElectricCar 생성자1 호출!");
//	}

	// alt + shift + s + c
	public ElectricCar(String color, int price, int seats, boolean isSuv, int maxCharge, int currentCharge) {
		super(color, price, seats, isSuv);
		this.maxCharge = maxCharge;
		this.currentCharge = currentCharge;
		System.out.println("ElectricCar 생성자2 호출!");
	}

	//////////////////////////////////////////////////////////
	public ElectricCar(int maxCharge, int currentCharge) {
		// this()는 맨 위에 있어야 함.
		// 아래처럼 쓰면 super()를 2번 부름
		// 이걸 풀어쓰면 다음과 같음
//		super();
//		this.maxCharge = maxCharge;
		this(maxCharge);
		this.currentCharge = currentCharge;
	}

	public ElectricCar(int maxCharge) {
		super();
		this.maxCharge = maxCharge;
	}
	
	// 메소드
	// 1. turnOn() 메소드 재정의 전기차 시동을 킵니다
	// 2. turnOff() 메소드 재정의 전기차 시동을 끕니다
	// 3. getCurrentCharge() 메소드 현재 충전량을 출력
//	void turnOn() {
//		System.out.println("전기차 시동을 킵니다");
//	}
//
//	void turnOff() {
//		System.out.println("전기차 시동을 끕니다");
//	}
//
//	void getCurrentCharge() {
//		System.out.println("현재 충전량 = " + currentCharge);
//	}

	// 모범답안
	// alt + shift + s + v
	@Override
	void turnOn() {
		System.out.println("전기차 시동을 킵니다");
	}

	@Override
	void turnOff() {
		System.out.println("전기차 시동을 끕니다");
	}

	void getCurrentCharge() {
		System.out.println("현재 충전량 = " + currentCharge);
	}
	
	// 충전 메소드
	void getCharge(int chargeNum) {
		// 만약 입력한 주유량이 최대 주유량보다 크다면 최대 주유량만큼 주유
		// 입력한 주유량이 0 또는 음수라면 정확한 주유량을 입력하세요 출력
		// 입력한 주유량과 현재 주유량의 합계가 최대 주유량보다 크면 최대 주유량 주유
		// 그외는 정상적인 주유
//		if (chargeNum <= 0) {
//			System.out.println("정확한 충전량을 입력하세요!");
//		} else {
//			if (chargeNum > maxCharge) {
//				currentCharge = maxCharge;
//			} else if (chargeNum + currentCharge > maxCharge) {
//				currentCharge = maxCharge;
//			} else {
//				currentCharge = currentCharge + chargeNum;
//			}
//		}

		// 모범답안
		if (chargeNum >= maxCharge) {
			currentCharge = maxCharge;
		} else if (chargeNum <= 0) {
			System.out.println("정확한 충전량을 입력하세요!");
		} else if ((chargeNum + currentCharge) >= maxCharge) {
			currentCharge = maxCharge;
		} else {
			currentCharge += chargeNum;
		}
	}

}
