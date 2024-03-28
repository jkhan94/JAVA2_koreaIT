package thread;

//Thread 클래스를 상속받는다
public class Thread1 extends Thread {

	// 멀티 스레드를 통해 처리해야 하는 작업을 작성한다
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("MultiThread hello");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}

	}

}
