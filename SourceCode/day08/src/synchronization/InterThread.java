package synchronization;

import java.util.Iterator;

public class InterThread implements Runnable {

	@Override
	public void run() {
// InterruptedException을 통해 종료 처리
//		for (int i = 0; i < 10; i++) {
//			System.out.println("작업중..");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Interrupted!");
////				break;
//				return;
//			}
//		}
		
//		try {
//			System.out.println("작업중..");			
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println("Interrupted!");
//		}

// Thread.interuupted()를 통해 종료 처리
		for (int i = 0; i < 10; i++) {
			System.out.println("작업중..");
			// interrupt() 메소드의 발생 여부를 리턴한다
			if (Thread.interrupted()) {
				break;
			}
		}

	}

}
