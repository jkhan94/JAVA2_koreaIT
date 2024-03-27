package access;

public class StaticTest {

	static void method() {
		System.out.println("mehod in StaticTest.");
	}

	public static void main(String[] args) {

		// 인스턴스 변수(필드)
		// classA : 인스턴스
		ClassA classA = new ClassA();
		System.out.println(classA.instanceData);
		System.out.println(classA.instanceData2);
		System.out.println(classA.instanceAr);

		// static 변수(필드)
		// ClassA : 클래스. 앞글자가 대문자.
		System.out.println(ClassA.staticData);
		System.out.println(ClassA.staticAr);
		System.out.println();

		// 인스턴스 메소드
		classA.instanceMenthod();
		// static 메소드
		ClassA.staticMethod();
		System.out.println();

		// 같은 클래스에 없으므로 어디에 있는지 알 수 없어서 에러
		// 클래스명.메소드명()으로 static 메소드를 사용한다
//		staticMethod();
		// 동일 클래스 내에 있으므로 객체가 없어도 찾아서 쓸 수 있다
		method();
	}

}
