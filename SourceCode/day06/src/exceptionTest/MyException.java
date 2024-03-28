package exceptionTest;

// 사용자 정의 예외
public class MyException extends Exception {

	public MyException() {
		// Exception의 생성자 호출
		super("올바르지 않은 이메일 형식");
	}
}
