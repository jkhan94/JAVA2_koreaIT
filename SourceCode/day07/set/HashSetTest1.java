package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {

		HashSet<String> category = new HashSet<String>();
		HashSet<String> category2 = new HashSet<>();

		// 추가
		// 중복을 혀용하지 않으므로 스릴러는 1회만 추가됨
		for (int i = 0; i < 5; i++) {
			category.add("스릴러");
		}
		category.add("자연과학");
		category.add("로맨스");

		System.out.println(category);
		System.out.println(category.toString());

		// 삭제
		category.remove("스릴러");
		System.out.println(category);

		// 길이
		System.out.println("size: " + category.size());

		// Iterator
		// 순서가 없는 자료에서 하나씩 꺼내주는 java.util에 있는 메소드
		// hasNext() : 다음이 있니. boolean 리턴
		// next() : 꺼내온 값을 반환
		Iterator<String> iter = category.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 포함 여부 조회
		// true, false로 조회
		System.out.println(category.contains("스릴러"));

	}
}