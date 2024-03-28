package synchronization;

public class Synchronization {

	public static void main(String[] args) {
		// 동기화

		// 자전거의 재고가 10개
		// 2명이 각각 5개를 샀으니 남은 재고는 0개여야 한다
		// 그러나 실행하면 재고가 0이 아니다
		// 이것을 "자원공유로 인한 문제"라고 한다.
		Bike bike = new Bike(10);
		Buyer buyer = new Buyer(bike);

		Thread kim = new Thread(buyer, "kim");
		Thread seo = new Thread(buyer, "seo");

		kim.start();
		seo.start();

	}

}
