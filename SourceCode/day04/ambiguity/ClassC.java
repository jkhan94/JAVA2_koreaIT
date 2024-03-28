package ambiguity;

// 함수를 재정의해서 모호성 해결
public class ClassC implements InterA, InterB {

	@Override
	public void printData() {
		System.out.println("재정의 된 메소드");
		// 인터페이스의 함수 호출시 아래처럼 사용.
		InterA.super.printData();
		InterB.super.printData();
	}

	@Override
	public void printData2() {
		System.out.println("ClassC printData2");
	}

}
