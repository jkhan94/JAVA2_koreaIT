package access2;

import access1.Access1;

//다른 패키지에 있는 Access1을 상속받는다
public class AccessTest2 extends Access1 {

	public static void main(String[] args) {

		// import하여 사용한다
		Access1 access1 = new Access1();

		// 다른 패키지일 경우 public만 접근 가능하다.
		// 나머지 접근 제어자는 not visible 에러가 뜬다. (볼 수 없다. 어딨는지 모르겠다)
		// 필드 접근
//		System.out.println(access1.defaultData);
		System.out.println(access1.publicData);
//		System.out.println(access1.protectData);
//		System.out.println(access1.privateData);

		// 메소드 접근
//		access1.defaultMethod();
		access1.publicMethod();
//		access1.protectedMethod();
//		access1.privateMethod();

		// 상속을 받아 protected 필드와 메소드 사용 가능.
		AccessTest2 access2 = new AccessTest2();
		System.out.println(access2.protectData);
		access2.protectedMethod();

	}

}
