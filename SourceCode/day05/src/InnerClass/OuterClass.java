package InnerClass;

// 외부 클래스
// 내부 클래스: 	// 단독으로 사용하지 않고 외부 클래스에서 사용한다로 해석
public class OuterClass {

	String data2 = "Outer Class field";

	// 인스턴스 내부클래스
	class InstanceInnerClass {
		String data = "InstanceInnerClass";

		// 상속받지 않았으나 외부클래스의 필드 사용 가능
		void printdata() {
			System.out.println(data2);
		}
	}
	
	// 스태틱 내부클래스
	static class StaticInnerClass {
		static String data4 = "StaticInnerClass";
		public static void staticMethod() {
			System.out.println(data4);
		}
	}

	// 지역 내부클래스
	void method() {
		class LocalInnerClass{
			String data3 = "Local Inner Class field";
		}
		LocalInnerClass local = new LocalInnerClass();
		System.out.println(local.data3);
	}

	public static void main(String[] args) {

		// 일반 클래스 객체화
		OuterClass outerClass = new OuterClass();
		
		// 내부클래스 객체화
		InstanceInnerClass instanceInner = outerClass.new InstanceInnerClass();
		StaticInnerClass staticInner = new OuterClass.StaticInnerClass();

		System.out.println(outerClass.data2);
		System.out.println(instanceInner.data);
		System.out.println(staticInner.data4);
		System.out.println();

		instanceInner.printdata();
		// printdata는 인스턴스 메소드이므로 static처럼 참조 불가.
//		OuterClass.InstanceInnerClass.printdata();
		
		staticInner.staticMethod();
		OuterClass.StaticInnerClass.staticMethod();
		
		outerClass.method();

	}

}
