package abstractTest;

// 추상클래스가 추상클래스를 상속받으면 추상메소드를 구현할 필요가 없다
public abstract class SmartTv extends Tv {

	abstract void getBlueTooth();

	// SmartTv를 상속받는 newSmartTv 클래스가 존재한다
	// newSmartTv 클래스는 추상메소드를 몇 개 구현해야 할까?
	// 3개

}
