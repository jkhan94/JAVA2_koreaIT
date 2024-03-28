package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] ar = null;

		System.out.println("몇 칸짜리 배열을 만들까요?");

//		// 예외 상황
//		// 정수를 입력하지 않았을 경우 InputMismatchException
//		// 음수를 입력하였을 경우 NegativeArraySizeException
//		// 그 외
//		// 코드를 실행해서 예외가 발생하는 클래스명 알아낸 뒤 try 내부로 코드 이동

////////////////////////////////////////////////////////////////////
//		// 실습1.
//		// 각각의 경우에 따라서 맞게 예외를 처리한다.
//		// 정수를 입력하지 않았을 경우 -> 정수를 입력하지 않았습니다 출력
//		// 음수를 입력하였을 경우 -> 음수를 입력하였습니다 출력
//		// 그외 -> 잘못된 입력입니다 출력
		try {
			// try에는 예외가 발생하는 구간만 넣는 것이 좋다.
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하지 않았습니다");
		} catch (NegativeArraySizeException e) {
			System.out.println("음수를 입력하였습니다");
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다");
		}

		ar = new int[num];
		System.out.println("length of array: " + ar.length);
		sc.close();

		// 모범답안
//		try {
//			Scanner sc = new Scanner(System.in);
//			int num = 0;
//			int[] ar = null;
//
//			System.out.println("몇칸 짜리 배열을 만들까요?");
//			num = sc.nextInt();
//			ar = new int[num];
//			System.out.println(ar.length);
//
//		} catch (InputMismatchException e) {
//			System.out.println("정수를 입력하지 않았습니다");
//		} catch (NegativeArraySizeException e) {
//			System.out.println("음수를 입력하였습니다");
//		} catch (Exception e) {
//			System.out.println("잘못된 입력입니다");
//		}

	}

}
