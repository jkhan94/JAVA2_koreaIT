package inheritance;

public class CastingTest1 {

	public static void main(String[] args) {

		Car car = new Car();
		DieselCar diesel = new DieselCar();
		ElectricCar electric = new ElectricCar();
		System.out.println();

		// instancof
		System.out.println(car instanceof Car);
		System.out.println(diesel instanceof DieselCar);
		System.out.println(electric instanceof ElectricCar);

		// 자식은 부모의 타입을 가진다.
		System.out.println(diesel instanceof Car);
		System.out.println(electric instanceof Car);

		// 부모는 자식의 타입을 가지지 않는다.
		System.out.println(car instanceof DieselCar);
		System.out.println(car instanceof ElectricCar);
		System.out.println();

		// up casting
		// 자식 객체의 주소값을 부모타입의 변수에 담을 수 있다.
		// 앞에 형변환을 위한 (Car car) 붙이지 않음 -> 자동형변환
		Car car1 = new DieselCar();
		Car car2 = new ElectricCar();

		// down casting
		// 부모를 자식으로 내리는 것이 아니라 부모가 된 자식을 원상태로 돌려놓는 것.
// 		DieselCar diesel3 = (DieselCar) new Car(); 안 됨.
		// Car cannot be cast to class DieselCar 에러 발생.
		DieselCar diesel2 = (DieselCar) car1;
		ElectricCar electric2 = (ElectricCar) car2;
		System.out.println(diesel2.color);
	}

}
