package thread;

public class ThreadA extends Thread {

	// run > ctrl+space
	// alt + shift + s + v
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("A 작업중..");
			try {
				// ms 단위
				// 실행 후 1초 딜레이
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}
