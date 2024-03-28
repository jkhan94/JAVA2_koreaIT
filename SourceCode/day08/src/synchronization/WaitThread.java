package synchronization;

public class WaitThread implements Runnable {

	@Override
	public void run() {
		waitMethod();		
	}

	public synchronized void waitMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("작업중");
			if (i == 4) {
				System.out.println("wait!");
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("waitMethod wait 예외");
				}
			}

			System.out.println("작업중..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("waitMethod sleep 예외");
			}
		}
	}

	public synchronized void notifyMethod() {
		for (int i = 0; i < 5; i++) {
			System.out.println("작업중2..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("waitMethod sleep 예외");
			}
		}
		System.out.println("notify!");
		notify();
	}

}
