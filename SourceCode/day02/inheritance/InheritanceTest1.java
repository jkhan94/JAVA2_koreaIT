package inheritance;

public class InheritanceTest1 {

	public static void main(String[] args) {

		DieselCar diesel = new DieselCar();

		// 자식 필드
		System.out.println(diesel.currentOil);
		// 부모 필드
		// DieselCar() 생성자에서 super("red", 10000, 5, true);로 초기화.
		System.out.println(diesel.color);
		System.out.println();

		// 자식 메소드
		diesel.getCurrentOil();
		// 부모 메소드
		diesel.turnOn();
		System.out.println();

		DieselCar diesel2 = new DieselCar("blue", 100000, 6, false, 50, 0);
		System.out.println(diesel2.color);
		System.out.println(diesel2.maxOil);

	}

}