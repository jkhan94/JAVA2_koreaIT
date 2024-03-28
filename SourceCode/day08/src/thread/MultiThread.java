package thread;

public class MultiThread {

	public static void main(String[] args) {

		// Thread 클래스 상속을 통한 멀티 스레드 구현
		ThreadA threadA = new ThreadA();
		// 스레드 시작
		// 써주지 않으면 JVM이 스레드라고 인식하지 못함
		threadA.start();

		// Runnable 인터페이스 구현을 통한 멀티 스레드 구현
		// 이걸 주로 사용
		// B1은 인터페이스를 구현했기 때문에 스레드 클래스의 B2를 통해 B1을 업캐스팅
		// B1은 ThreadB, Thread, Runnable 타입 모두 가질 수 있음
		ThreadB threadB1 = new ThreadB();
		Thread threadB2 = new Thread(threadB1);
		threadB2.start();

		Thread threadB3 = new Thread(new ThreadB());

		// 람다식
		Thread threadB4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("B4 작업중..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		for (int i = 1; i <= 5; i++) {
			System.out.println("C 작업중..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
