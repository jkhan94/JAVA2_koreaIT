package access1;

public class Access1 {

	// 필드
	// [접근 권한 제어자] [자료형] 변수명]
	int defaultData;
	public int publicData;
	protected int protectData;
	private int privateData;

	// 메소드
	// [접근 권한 제어자] [static] [리턴타입] [메소드명]
	void defaultMethod() {
		System.out.println("default");
	}

	public void publicMethod() {
		System.out.println("public");
	}

	protected void protectedMethod() {
		System.out.println("protected");
	}

	private void privateMethod() {
		System.out.println("private");
	}

	// 이런 식으로 정의하기 시작하면 너무 중구난방
	// 따라서 getter, setter로 통일시킴
//	void setPrivateData(int privateData) {
//		this.privateData = privateData;
//	}

	// Getter, setter 단축키 : alt + shift + s + r
	public int getPrivateData() {
		return privateData;
	}

	public void setPrivateData(int privateData) {
		this.privateData = privateData;
	}

}
