package inter1;

public class InterTest {

	public static void main(String[] args) {

		// 인터페이스 필드 출력
		// static 변수 및 메소드는 객체를 생성(객체화)하지 않아도 사용할 수 있다
		// static 변수는 클래스명.변수명으로 접근한다
		// 온점 연산자 : 최우선 연산자
		System.out.println(Radio.VOLT);
		System.out.println(Radio.CABLE);
		System.out.println();

		// 인터페이스 메소드 출력
		// 인터페이스 Radio는 미구현되어 있기 때문에 instantiate(객체화) 불가
		// 따라서 메소드를 완성시킬 클래스가 필요하다.
//		Radio radio = new Radio();
		SmartRadio smart = new SmartRadio();
		smart.getCd();
		smart.startMusic();
		smart.stopMusic();

	}

}
