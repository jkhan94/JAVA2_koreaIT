package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {

		// 사용자가 입력한 문자열에 @가 포함되어 있지 않으면
		// MyException을 발생시킨다
		Scanner sc = new Scanner(System.in);
		String id = null;

		System.out.println("아이디를 입력하세요");
		id = sc.next();

		try {
			if (!id.contains("@")) {
				throw new MyException();
			}
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

////////////////////////////////////////////////////////////////////
		// 실습1.
		// 각각의 상황에 따라 예외처리를 한다
		// 사용자가 입력한 정수가 음의 정수일 경우 -> 음의 정수를 입력하였습니다 출력
		// 사용자가 입력한 정수가 0일 경우 -> 0을 입력하였습니다 출력
		// 사용자가 정수를 입력하지 않았을 경우 -> 정수를 입력하세요 출력

		System.out.println("양의 정수를 입력하세요");
//		int num1 = 0;
//		try {
//			num1 = sc1.nextInt();
//			if (num1 < 0) {
//				System.out.println("음의 정수를 입력하였습니다");
//			} 
//			if (num1 == 0) {
//				System.out.println("0을 입력하였습니다");
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("정수를 입력하세요");
//		}

		// 모범답안
		int num2 = 0;
		try {
			// nextInt가 try 외부에 있는데 정수를 입력하지 않으면 InputMismatchException이 발생.
			// 그러나 try 구문 밖에서 발생한거라 catch가 실행되지 않음.
			num2 = sc.nextInt();
			if (num2 < 0) {
				throw new NegativeException();
			} else if (num2 == 0) {
				throw new ZeroException();
			}
		} catch (NegativeException e) {
			System.out.println("음의 정수를 입력하였습니다");
		} catch (ZeroException e) {
			System.out.println("0을 입력하였습니다");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
		}

		sc.close();

	}

}
