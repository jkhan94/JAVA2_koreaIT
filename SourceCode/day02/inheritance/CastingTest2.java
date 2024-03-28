package inheritance;

public class CastingTest2 {

	public static void main(String[] args) {

		// 타입에 맞춰서 각각 선언
		// 이건 업캐스팅 아님
		Station station = new Station();
		DieselCar diesel = new DieselCar();
		ElectricCar electric = new ElectricCar();
		System.out.println();

		// 메소드에 매개변수로 넣어주면서 업캐스팅됨
		// 메소드의 매개변수인 Car car를 통해 업캐스팅 된다.
		station.getCar(diesel, -10);
		station.getCar(electric, -30);
		System.out.println();
		
		// 값 자체로 매개변수에 전달한다
		station.getCar(new DieselCar(), -10);
		//변수를 통해서 값을 매개변수에 전달한다
		station.getCar(diesel, -10);
		System.out.println();

		// car에선 "시동을 끕니다"가 출력되어야 하지만 실제로는 전기차 시동을 끕니다 출력.
		// turnOff는 재정의된 함수 = 상속된 함수이므로 업캐스팅되어 있어도 접근 가능.
		// 상속받은 메소드를 자식 클래스에서 재정의했다면(오버라이딩)
		// 업캐스팅된 상태에서도 재정의된 메소드로 호출 가능.
		Car car = new ElectricCar(); // 업캐스팅
		car.turnOff();
	}
	
	// DieselCar 클래스는 몇 개의 타입을 가질까?
	// 총 4개의 타입을 가진다.
	// DieselCar, Car, Carriage, Object

}
