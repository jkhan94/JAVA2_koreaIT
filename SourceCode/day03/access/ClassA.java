package access;

public class ClassA {

// 필드 초기화
	// 인스턴스 변수 실행순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
	// 명시적 초기화
	int instanceData = 20;

	// 생성자를 통한 초기화
	int instanceData2;

	// 초기화 블럭을 이용한 초기화
	// 객체가 생성될 때마다 실행된다.
	int[] instanceAr;
	// 영역을 만들 때는 중괄호를 사용 {}
	// instance 초기화 블럭
	{
		instanceAr = new int[3];
		for (int i = 0; i < instanceAr.length; i++) {
			instanceAr[i] = i;
		}
	}

///////////////////////////////////////////////////////////
	// static 필드 실행순서 : 기본값 -> 명시적 초기화 -> static 초기화 블럭
	static int staticData;
	static int[] staticAr;

	// static 초기화 블럭
	// 클래스가 처음으로 메모리에 로딩될 때 단 한 번만 실행된다
	// 로딩 : 컴파일러가 이클립스 내의 정보를 읽는 것
	// 중괄호 앞에 static을 붙임
	static {
		staticAr = new int[3];
		for (int i = 0; i < staticAr.length; i++) {
			staticAr[i] = i;
		}
	}

////////////////////////////////////////////////////////////////////
	// 인스턴스 메소드
	void instanceMenthod() {
		System.out.println("InstanceMethod");
		System.out.println("instanceData = " + instanceData);
	}

	// static 메소드
	static void staticMethod() {
		System.out.println("staticMethod");
		System.out.println("staticData = " + staticData);
		// static 메소드는 인스턴스 변수를 쓸 수 없다.
//		System.out.println("instanceData = " + instanceData);
	}

}
