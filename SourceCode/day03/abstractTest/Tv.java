package abstractTest;

// 클래스 생성 시 abstract 키워드 선택하면 추상클래스로 자동 생성
public abstract class Tv {
	
	//추상메소드
	abstract void turnOn();
	abstract void turnOff();
	
	//메소드
	void getHDMI() {
		System.out.println("HDMI 케이블 연결!");
	}

}
