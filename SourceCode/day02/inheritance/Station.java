package inheritance;

public class Station {

	// 들어오는 차량의 종류에 따라서
	// 경유차는 경유를 주유한다
	// 전기차는 전기를 충전한다

	// 그냥 선언하면 다음처럼 다 따로 써줘야 함.
//	void getCar(DieselCar diesel, int OilNum) {
//		diesel.fillUP(OilNum);
//	}
//	
//	void getCar(ElectricCar electric, int chargeNum) {
//		electric.getCharge(chargeNum);
//	}

	// up casting시 아래처럼 사용
	void getCar(Car car, int num) {
		// 전기차라면 getCharge()
		if (car instanceof ElectricCar) {
			System.out.println("충전을 시작합니다");
			// down casting
			ElectricCar electric = (ElectricCar) car;
			electric.getCharge(num);
		}
		// 경유차라면 fillUp()
		else if (car instanceof DieselCar) {
			System.out.println("주유를 시작합니다");
			// down casting
			DieselCar diesel = (DieselCar) car;
			diesel.fillUP(num);
		}
	}

}
