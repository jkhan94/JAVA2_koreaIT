package lambda;

public class LambdaTest {

	public static void main(String[] args) {

		// 인터페이스 구현방법
		// 1. implements 키워드 클래스
		// 2. 익명클래스
		// 3. 람다식
		// 4. 선언, 생성, 호출을 한번에

// 1. implements 키워드 클래스
		MyClass myClass = new MyClass();
		myClass.printData();

// 2. 익명클래스
		MyInter myInter = new MyInter() {
			@Override
			public void printData() {
				System.out.println("익명 클래스를 통한 구현");
			}
		};
		myInter.printData();

// 3. 람다식
		// 위의 익명 클래스를 람다식으로 구현하면 아래처럼 된다
		MyInter myInter2 = () -> System.out.println("람다식을 통한 구현");
		myInter2.printData();

// 4. 선언, 생성, 호출을 한번에
// 자주 쓰지 않음
		(new MyInter() {

			@Override
			public void printData() {
				System.out.println("선언, 생성, 호출을 한번에 해서 구현");
			};

		}).printData();

	}

}
