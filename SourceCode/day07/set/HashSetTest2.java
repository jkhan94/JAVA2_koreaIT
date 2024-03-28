package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<Book> booklist = new HashSet<>();

		// 책별로 주소가 부여된다
		// hashCode, equals를 재정의할 떄 기준을
		// number: 책번호가 같으면 제목 무관하게 같은 걸로 인식.
		// name: 책 제목이 같으면 번호와 무관하게 같은 걸로 인식.
		// number, name: 책번호와 이름이 모두 같아야 같은 걸로 인식.
		Book book1 = new Book(1, "자바의 비밀");
		Book book2 = new Book(1, "파이썬의 비밀");
		Book book3 = new Book(2, "파이썬의 비밀");
		Book book4 = new Book(3, "C언어의 비밀");

		// 중복된 값은 1번만 들어간다
		for (int i = 0; i < 10; i++) {
			booklist.add(book1);
		}
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);

		System.out.println(booklist);		
		Iterator<Book> iter = booklist.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		// 책 번호로 포함 여부를 확인해서 true.
		System.out.println(booklist.contains(book2));
		System.out.println(book2);

	}

}