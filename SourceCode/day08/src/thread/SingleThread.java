package thread;

public class SingleThread {

	public static void main(String[] args) {

		// 싱글 스레드
		// A, B, C 순서로 작업
		for (int i = 1; i < 5; i++) {
			System.out.println("A 작업중..");
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("B 작업중..");
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("C 작업중..");
		}

	}

}
