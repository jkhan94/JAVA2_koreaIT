package inheritance;

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		DieselCar diesel = new DieselCar();
		System.out.println();
		
		//자식 필드
		System.out.println(diesel.maxOil);
		System.out.println(diesel.currentOil);
		System.out.println();
		
		//부모 필드
		System.out.println(diesel.color);
		System.out.println(diesel.price);
		System.out.println(diesel.seats);
		System.out.println(diesel.isSuv);
		System.out.println();
		
		//자식 메소드
		diesel.getCurrentOil();
		System.out.println();
		
		//부모 메소드
		diesel.turnOn();
		diesel.turnOff();

	}

}
