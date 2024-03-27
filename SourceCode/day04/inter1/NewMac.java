package inter1;

public class NewMac extends RadioAdapter implements Laptop, Mike {

	@Override
	public void getVoice() {

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOn(int power) {

	}

	@Override
	public void turnOff() {

	}

	// Radio 인터페이스의 추상메소드 구현의 강제성을 RadioAdapter에서 해결
	// 그리고 RadioAdapter를 상속받아 필요한 메소드만 재정의한다
	@Override
	public void startMusic() {
		super.startMusic();
	}

	@Override
	public void stopMusic() {
		super.stopMusic();
	}

}
