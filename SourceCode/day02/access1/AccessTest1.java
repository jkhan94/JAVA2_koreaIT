package access1;

public class AccessTest1 {

	public static void main(String[] args) {
		
		Access1 access1 = new Access1();
		
		//필드 접근
		System.out.println(access1.defaultData);
		System.out.println(access1.publicData);
		System.out.println(access1.protectData);
		//private은 그 클래스 내부가 아니면 사용 불가 -> 에러
//		System.out.println(access1.privateData);
		
		// 메소드 접근
		access1.defaultMethod();
		access1.publicMethod();
		access1.protectedMethod();
//		access1.privateMethod();
	}

}
