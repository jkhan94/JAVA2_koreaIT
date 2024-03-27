package abstractTest;

public class AbstracTest1 {

	public static void main(String[] args) {

		// 추상 클래스는 객체화 할 수 없다
		// Tv에 미완성된 함수가 있어서 객체화 불가능
		// 자식클래스에서 추상메소드를 정의했어도 Tv내에선 계속 추상메소드
		// 따라서 아래처럼 Tv, SmartTv를 객체화 할 수는 없다
//		Tv tv = new Tv();
//		SmartTv smart = new SmartTv();

		// 추상클래스를 상속받은 자식클래스는 추상메소드 구현에 대한 강제성을 갖는다
		NormalTv normal = new NormalTv();
		normal.turnOn();
		normal.turnOff();
		normal.getHDMI();
		System.out.println();

		NewSmartTv newSmartTv = new NewSmartTv();
		newSmartTv.getBlueTooth();
		newSmartTv.getHDMI();
		newSmartTv.turnOff();
		System.out.println();

		// up casting 해서 자식클래스를 구현한 것
		// up casting : 자식 객체의 주소값을 부모 타입으로 형변환
		Tv tv = new NormalTv();
		tv.getHDMI();
		tv.turnOn();
		tv.turnOff();
		System.out.println();

		// newSmartTv가 SmartTv 타입인지.
		// newSmartTv가 Tv 타입인지.
		System.out.println(newSmartTv instanceof SmartTv);
		System.out.println(newSmartTv instanceof Tv);

	}

}
