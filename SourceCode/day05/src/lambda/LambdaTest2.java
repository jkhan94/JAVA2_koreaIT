package lambda;

public class LambdaTest2 {

	public static void main(String[] args) {

// InterA
// 매개변수 1개
// 실행할 문장 1개 - 이름 입력받아 000님 안녕하세요 출력
// 함수 원형: void printName(String name);

		InterA interA = (String name) -> System.out.println(name + "님 안녕하세요");
		interA.printName("Han");

		// 모범답안
		InterA interA1 = (String name) -> {
			System.out.println(name + "님 안녕하세요");
		};
		interA1.printName("Han2");

		InterA interA2 = name -> System.out.println(name + "님 안녕하세요");
		interA2.printName("Han");
		System.out.println();

/////////////////////////////////////////////////////////////////////
// InterB
// 매개변수 1개
// 실행할 문장 - 숫자를 입력받아 짝홀 판별하고 판별 결과를 리턴
// 함수 원형: boolean isEven(int num);

		InterB interB = (int num) -> {
			boolean result = true;
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
				result = true;
			} else if (num % 2 != 0) {
				System.out.println("홀수입니다.");
				result = false;
			}
			return result;
		};

		// 모범답안
		InterB interB1 = (int num) -> {
			return num % 2 == 0;
		};

		InterB interB2 = num -> num % 2 == 0;

		System.out.println(interB.isEven(10));
		System.out.println(interB1.isEven(20));
		System.out.println(interB2.isEven(35));
		System.out.println();

/////////////////////////////////////////////////////////////////////	
// InterC
// 매개변수 2개
// 실행할 문장 - 입력한 두 정수의 합을 리턴
// 함수 원형: int sum(int a, int b);

		InterC interC = (int a, int b) -> a + b;
		System.out.println(interC.sum(1, 5));

		// 모범답안
		InterC interC1 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(interC1.sum(10, 20));

		// InterC와 동일.
//		InterC interC2 = (int a, int b) -> a + b;
//		System.out.println(interC2.sum(20, 30));
		System.out.println();

/////////////////////////////////////////////////////////////////////	
// InterD
// 매개변수 2개
// 실행할 문장 - 입력한 문자열을 입력한 정수 횟수만큼 출력
// 함수원형: String printMsg(int num, String msg);

		InterD interD = (int num, String msg) -> {
			for (int i = 0; i < num; i++) {
				System.out.println(msg);
			}
			return msg;
		};
		interD.printMsg(3, "rap");

		// 모범답안
		// interD와 동일.
//		InterD interD1 = (int num, String msg) -> {
//			for (int i = 0; i < num; i++) {
//				System.out.println(msg);
//			}
//			return msg;
//		};
//		interD1.printMsg(3, "홍길동");

		InterD interD2 = (num, msg) -> {
			for (int i = 0; i < num; i++) {
				System.out.println(msg);
			}
			return msg;
		};
		String text = interD2.printMsg(4, "김길동");
		System.out.println("리턴값 " + text);

	}

}
