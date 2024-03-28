package thread;

public class ThreadTest1 {

	public static void main(String[] args) {

// 단일 스레드
		// 순서대로 출력된다
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println("hello");

// 멀티 스레드
		// Thread 클래스 상속
		Thread1 t1 = new Thread1();
//		t1.run();	// run()만 사용하면 JVM이 멀티 스레드로 인식하지 못한다
		t1.start(); // start() 메소드를 통해 JVM에 멀티스레드 여부를 알려준다
		t1.setName("t1 스레드");

		// Runnable 인터페이스를 구현하는 Thread2에는 start()함수가 없다
		// 따라서 Thread2의 인스턴스를 생성한 다음
		// Thread 함수에 이 인스턴스를 인수로 넘겨서 스레드 생성.
		// 보통은 상속을 아끼기 위해 인터페이스로 멀티 스레드를 구현한다
		Thread2 t2 = new Thread2();
		Thread t3 = new Thread(t2, "t2 스레드");
		t3.start();

		Thread t4 = new Thread(() -> {
			System.out.println("람다식을 통한 스레드");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}, "t4");
		t4.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			// 스레드 이름 출력
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
