package api;

import java.util.Random;

public class ApiTest {

	public static void main(String[] args) {

// 내부 API
// Random 클래스 : 난수 생성
		Random random = new Random();
		int num = random.nextInt();
		System.out.println(num);

		// n 미만의 랜덤한 정수를 리턴
		int num2 = random.nextInt(10);
		System.out.println(num2);
		System.out.println();

// Math 클래스
		// ceil() 올림
		System.out.println(Math.ceil(9.1));
		
		// floor() 버림
		System.out.println(Math.floor(9.1));
		
		// round() 소수점 첫째 자리에서 반올림
		System.out.println(Math.round(9.5));
		System.out.println(Math.round(9.0));

	}

}
