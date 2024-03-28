package synchronization;

public class Buyer implements Runnable {

	Bike bike;

	public Buyer(Bike bike) {
		this.bike = bike;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			buy1();
//			buy2();
			buy3();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 일반 메소드
	// buy1 : 동기화되어 있지 않다.
	public void buy1() {
		bike.num--;
		System.out.println(Thread.currentThread().getName() + " 1개 구매");
		System.out.println("현재 재고 = " + bike.num);
	}

	// 메소드 동기화
	public synchronized void buy2() {
		bike.num--;
		System.out.println(Thread.currentThread().getName() + " 1개 구매");
		System.out.println("현재 재고 = " + bike.num);
	}

	// 블록 동기화
	public void buy3() {
		synchronized (this) {
			bike.num--;
			System.out.println(Thread.currentThread().getName() + " 1개 구매");
			System.out.println("현재 재고 = " + bike.num);
		}
	}

}
