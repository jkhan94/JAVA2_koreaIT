package abstractTest;

public class NewSmartTv extends SmartTv {

	// 부모
	@Override
	void getBlueTooth() {
		System.out.println("블루투스 연결");

	}

	// 부모의 부모
	@Override
	void turnOn() {
		System.out.println("어플로 전원을 킵니다");
	}

	@Override
	void turnOff() {
		System.out.println("어플로 전원을 끕니다");
	}

}
