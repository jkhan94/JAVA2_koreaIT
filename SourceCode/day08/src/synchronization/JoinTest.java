package synchronization;

import thread.ThreadB;

public class JoinTest {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new ThreadB());
		Thread thread2 = new Thread(new ThreadB());

		thread1.start(); // Thread-0
//		thread2.start(); // Thread-1

		// alt + shift + z > try/catch block
		// 현재 스레드의 작업을 멈추고
		// join 메소드를 사용한 스레드의 작업이 끌날 때까지 기다린다.
		System.out.println("join!");
		try {
			thread1.join();
//			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// thread0, thread1이 끌날 때까지 main 스레드는 대기
		System.out.println("main 스레드 종료");
	}

}
