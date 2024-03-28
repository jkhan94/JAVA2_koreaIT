package anonymous;

public class AnonymousTest {

	public static void main(String[] args) {

		// 부모 클래스
		ClassA classA = new ClassA();

		// 익명 자식 클래스
		// 익명클래스라서 중괄호 앞에 클래스 이름이 없다
		// { } 영역은 클래스라서 오버라이딩 가능
		// 한 번만 사용할 거라 별도의 클래스로 만들지 않음
		ClassA classA2 = new ClassA() {
			void childMethod() {
				System.out.println("child Method");
			}

			@Override
			void printData() {
				System.out.println("익명 자식클래스의 메소드");
			}
		};

		classA.printData();
		classA2.printData();
		// 업캐스팅된 자식 클래스의 알파 부분으로 다운캐스팅 필요
//		classA2.childMethod();

		// 익명 추상 클래스
		AbstractA abstractA = new AbstractA() {
			@Override
			void printData() {
				System.out.println("익명 추상클래스의 메소드");
			}
		};

		abstractA.printData();
		
		// 익명 인터페이스
		InterA interA = new InterA() {
			@Override
			public void printData() {
				System.out.println("익명 클래스의 메소드");
			}
		};
		
		interA.printData();
		
	}

}
