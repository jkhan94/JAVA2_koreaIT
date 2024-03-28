package inheritance;

// 부모 클래스
public class Car extends Carriage {

	// 필드
	String color;
	int price;
	int seats;
	boolean isSuv;

	// 생성자 (alt + shift + s + o)
	public Car() {
		super();
		// Object 클래스를 상속받기 때문에 Object 클래스의 생성자를 호출한다
		System.out.println("Car 생성자1 호출!");
	}

	public Car(String color, int price, int seats, boolean isSuv) {
		super();
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