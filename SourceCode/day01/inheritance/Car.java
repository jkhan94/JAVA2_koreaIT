package inheritance;

// 부모 클래스
public class Car {
	// 필드
	String color;
	int price;
	int seats;
	boolean isSuv;

	// 생성자
	// alt + shift + s + o
	public Car() {
		// Car 클래스에도 부모 클래스가 있다.
		// 모든 클래스는 Object 클래스를 상속받는다.
		// Object 클래스를 상속받기 때문에 Object 클래스의 생성자를 호출한다.
		super();
		System.out.println("Car 생성자1 호출!");
	}

	public Car(String color, int price, int seats, boolean isSuv) {
		super(); // Object 클래스 생성자
		this.color = color;
		this.price = price;
		this.seats = seats;
		this.isSuv = isSuv;
		System.out.println("Car 생성자2 호출!");
	}

	// 메소드
	void turnOn() {
		System.out.println("시동을 킵니다");
	}
	
	void turnOff() {
		System.out.println("시동을 끕니다");
	}
}
