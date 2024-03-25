package inheritance;

public class InheritanceTest2 {

	public static void main(String[] args) {

		// 쉬는 시간 10:35시까지~!

		// 실습1.
		// ElectricCar 클래스 만들기 (Car 클래스를 상속받는다)

		// 필드 (최대 충전량 maxCharge, 현재 충전량 currentCharge)

		// 메소드
		// 1. turnOn() 메소드 재정의 전기차 시동을 킵니다
		// 2. turnOff() 메소드 재정의 전기차 시동을 끕니다
		// 3. getCurrentCharge() 메소드 현재 충전량을 출력

		// 생성자
		// 생성자1 -> 매개변수 x
		// 생성자2 -> 모든 필드를 초기화 한다(부모 필드는 부모생성자가 초기화한다)
		// 매개변수 6개

		ElectricCar electric = new ElectricCar();
		// 자식 필드
		System.out.println(electric.currentCharge);
		// 부모 필드
		System.out.println(electric.color);
		// 자식 메소드
		electric.getCurrentCharge();
		// 부모 메소드
		electric.turnOn();
		System.out.println();

		ElectricCar electric2 = new ElectricCar("white", 10000, 5, false, 30, 0);
		System.out.println(electric2.color);
		System.out.println(electric2.maxCharge);

		// 모범답안
//		ElectricCar electric3 = new ElectricCar("white", 10000, 5, false, 30, 0);
//		
//		System.out.println(electric3.color);
//		System.out.println(electric3.maxCharge);

	}

}