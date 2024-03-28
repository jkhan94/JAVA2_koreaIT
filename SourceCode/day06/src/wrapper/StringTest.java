package wrapper;

public class StringTest {

	public static void main(String[] args) {

		// String 클래스의 메소드
		String msg = "안녕하세요";

		// charAt()
		System.out.println(msg.charAt(0)); // 안

		// indexOf()
		// 찾는 문자열의 자리 번호 반환
		// 찾는 문자열이 존재하지 않으명 -1 리턴
		System.out.println(msg.indexOf("안")); // 0
		System.out.println(msg.indexOf("세")); // 3
		System.out.println(msg.indexOf("너")); // -1
		System.out.println();

		// split(): 지정 문구를 기준으로 분리 후 문자열 배열로 반환.
		String msg2 = "안!녕!하!세!요!";
		String[] ar = msg2.split("!"); // ar = {"안", "녕", "하", "세", "요"}
		// foreach 문
		for (String string : ar) {
			System.out.print(string+" ");
		}
		System.out.println();

		// substring(start, end): start 인덱스부터 end-1 까지
		System.out.println(msg2.substring(0, 3));

		// length()
		System.out.println(msg2.length());

		// contains(): 해당 문자열이 msg2에 있는지 boolean으로 반환
		System.out.println(msg2.contains("hello"));
		System.out.println(msg2.contains("!"));
		System.out.println();

		// strip()
		// 양쪽 여백을 제거
		String msg3 = "                안녕 하세요              ";
		System.out.println(msg3);
		System.out.println(msg3.strip());

	}

}
