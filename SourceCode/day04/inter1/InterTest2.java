package inter1;

import java.util.Scanner;

public class InterTest2 {

	public static void main(String[] args) {

		// 실습1.
		// Laptop 인터페이스
		// void turnOn() 메소드
		// void turnOff() 메소드

		// Mac 클래스(Laptop 인터페이스를 구현한다)
		// turnOn() 메소드 전원을 킵니다 출력
		// turnOff() 메소드 전원을 끕니다 출력

		Mac mac = new Mac();
		mac.turnOn();
		mac.turnOff();
		System.out.println();

/////////////////////////////////////////////////////////////////		
		// 실습2.
		// Laptop 인터페이스에 Power 필드 추가(220)

		// Mac 클래스
		// turnOn() 수정
		// 사용자가 입력한 전압이 기존 전압과 일치하지 않으면
		// 전압이 일치하지 않습니다 출력
		// 일치하면 전원을 킵니다 출력

		// turnOff() 수정
		// 전원이 켜져있으면 전원을 끕니다 출력
		// 전원이 커져있지 않으면 전원이 켜져있지 않습니다 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("전압을 입력하세요");
		int power = sc.nextInt();
		mac.turnOn(power);
		mac.turnOff();

	}

}
