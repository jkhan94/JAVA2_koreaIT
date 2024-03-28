package synchronization;

public class WaitTest {

	public static void main(String[] args) {

		WaitThread waitThread = new WaitThread();
		Thread thread = new Thread(waitThread);
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		waitThread.notifyMethod();

	}

}
