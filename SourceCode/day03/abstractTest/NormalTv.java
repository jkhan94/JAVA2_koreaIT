package abstractTest;

// Tv클래스의 추상메소드를 미정의 시 에러 뜸
public class NormalTv extends Tv {

	// Tv 클래스의 추상 메소드 구현에 대한 강제성을 가진다
	// alt + shift + s + v
	@Override
	void turnOn() {
		System.out.println("리모컨으로 전원을 킵니다");
	}

	@Override
	void turnOff() {
		System.out.println("리모컨으로 전원을 끕니다");
	}

}
