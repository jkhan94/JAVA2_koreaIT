package ambiguity;

public class AmbiguityTest1 {

	public static void main(String[] args) {

		// 재정의 된 메소드를 사용하므로 모호하지 않다.
		// 호출해야 할 함수가 명확하다.
		ClassC classC = new ClassC();
		classC.printData();
		System.out.println();
		
		classC.printData2();
		System.out.println();

		ChildD childD = new ChildD();
		childD.printData();

	}

}
