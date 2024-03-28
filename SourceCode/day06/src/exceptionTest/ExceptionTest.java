package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// Exception in thread "main" java.util.InputMismatchException
		// 사용할 예외이름마다 catch로 선언하고 코드 작성
		try {
			Scanner sc = new Scanner(System.in);
			int num = 0;
			System.out.println("정수를 입력하세요");
			num = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하지 않았습니다.");
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");

			// toString(): 발생한 예외 객체를 문자열로 반환. 생략 가능
			System.out.println(e.toString());
			System.out.println(e);

			// getMessage(): 예외 메시지를 문자열로 반환
			System.out.println(e.getMessage());

			// printStactTrace(): 예외 발생 지점을 추적하여 단계별로 전부 출력
			e.printStackTrace();
		}
		// 예외와 무관하게 무조건 실행하는 코드
		finally {
			System.out.println("반드시 실행하는 코드");
		}

		System.out.println("예외처리 끝나고 실행되는 코드");

	}

}
