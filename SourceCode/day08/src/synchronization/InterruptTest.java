package synchronization;

public class InterruptTest {

	public static void main(String[] args) {
		Thread thread = new Thread(new InterThread());
		thread.start();
		
// InterruptedException을 통해 종료 처리		
//		try {
//			Thread.sleep(1000);
//			thread.interrupt();
//		} catch (InterruptedException e) {
//			
//		}

		
// Thread.interrupted()를 통해 종료 처리
		thread.interrupt(); 
	}

}
