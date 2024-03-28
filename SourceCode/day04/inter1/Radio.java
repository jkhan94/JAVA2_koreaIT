package inter1;

public interface Radio {
	// 변수
	// static이 붙으면 이탤릭체 파란 글씨가 된다
	// 인터페이스에선 별도로 static final을 붙이지 않아도 알아서 붙는다
	// 상수는 대문자로 선언(암묵적 규친)
	int VOLT = 220;
	// 명시적 초기화를 하지 않으면 volt2=0으로 고정
	// 0을 사용하기 위해 변수를 설정한 것이 되서 경고가 뜸
//	int VOLT2;
	public static final String CABLE = "C타입";

	// 메소드
	// public abstract 키워드가 자동으로 붙는다.
	// 구현해야 할 메소드들을 규격화 및 통일
	void getCd();

	public abstract void startMusic();

	void stopMusic();

}
