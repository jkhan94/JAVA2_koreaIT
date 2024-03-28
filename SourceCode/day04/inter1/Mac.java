package inter1;

// 클래스 생성 시 superclass:상속 ~ 그 아래 interfaces:구현
public class Mac implements Laptop {
	// 실습1.
	// Mac 클래스(Laptop 인터페이스를 구현한다)
	// turnOn() 메소드 전원을 킵니다 출력
	// turnOff() 메소드 전원을 끕니다 출력

	@Override
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}

//	@Override
//	public void turnOff() {
//		System.out.println("전원을 끕니다");
//	}

/////////////////////////////////////////////////////////////////
	// 실습2.
	// turnOn() 수정
	// 사용자가 입력한 전압이 기존 전압과 일치하지 않으면
	// 전압이 일치하지 않습니다 출력
	// 일치하면 전원을 킵니다 출려

	// turnOff() 수정
	// 전원이 켜져있으면 전원을 끕니다 출력
	// 전원이 커져있지 않으면 전원이 켜져있지 않습니다 출력

	// 전역변수
	boolean runState;

	@Override
	public void turnOn(int power) {
		if (power == POWER) {
			System.out.println("전원을 킵니다");
			runState = true;
		} else {
			System.out.println("전압이 일치하지 않습니다");
		}
	}

	@Override
	public void turnOff() {
		if (runState) {
			System.out.println("전원을 끕니다");
			runState = false;
		} else {
			System.out.println("전원이 켜져있지 않습니다");
		}

		// ==============================================
		// 위, 아래 코드는 동일하다
//		if (runState) {
//			System.out.println("전원을 끕니다");
//			runState = false;
//			return;
//		}
//		System.out.println("전원이 켜져있지 않습니다");

	}

}
