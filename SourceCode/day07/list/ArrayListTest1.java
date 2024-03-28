package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		int[] array = new int[3];

		// 배열리스트를 쓸 경우 객체명만 사용해도 내용을 출력할 수 있다
		// ar과 ar.toString()의 결과는 동일하다
		// ar을 출력할 경우 자동으로 toString()을 호출한다
		System.out.println(ar);
		System.out.println(ar.toString());
		System.out.println(array);
		for (int i : array) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n\n");

		////////////////////////////////////////////////////
		// 추가
		ar.add(3);
		ar.add(2);
		ar.add(1);
		System.out.println(ar);
		
		// 원하는 자리에 추가
		// 객체명.add(인덱스번호, 값)
		ar.add(0, 10);
		System.out.println(ar);

		// 길이
		// 배열 길이: array.length
		System.out.println("size: " + ar.size());
		System.out.println();

		// 조회
		System.out.println(array[0]);
		System.out.println(ar.get(0));
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
		}
		System.out.println();

		// 수정
		ar.set(0, 100);
		System.out.println(ar);

		// 삭제
		ar.remove(0);
		System.out.println(ar);

		// 포함 여부 조회
		System.out.println(ar.contains(0));
		System.out.println(ar.contains(2));
		System.out.println();
		
/////////////////////////////////////////////////////
		// collection은 인터페이스
		// Collections는 클래스 // 컬렉션 프레임워크에서 사용할 수 있는 도구 모음
		// 정렬(오름차순)
		Collections.sort(ar);
		System.out.println(ar);

		// 정렬(내림차순)
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);

		// shuffle
		Collections.shuffle(ar);
		System.out.println(ar);

	}

}