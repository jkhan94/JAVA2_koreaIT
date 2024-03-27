package inter1;

// 에러를 확인하면 add unimplemented methods가 뜬다
// 그거 누르면 구현해야 할 함수를 불러온다
// alt + shift + s + v로도 불러올 수 있다.
public class SmartRadio implements Radio, Mike {

	// Radio
	@Override
	public void getCd() {
		System.out.println("CD 삽입");
	}

	@Override
	public void startMusic() {
		System.out.println("음악을 재생합니다");
	}

	@Override
	public void stopMusic() {
		System.out.println("음악을 재생을 멈춥니다");
	}
	
	// Mike
	@Override
	public void getVoice() {
		System.out.println("음성 인식");
		
	}

}
