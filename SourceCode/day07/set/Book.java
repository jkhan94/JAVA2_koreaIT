package set;

import java.util.Objects;

public class Book {

	int number;
	String name;

	public Book(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	// alt + shift + s + s
	@Override
	public String toString() {
		return "Book [number=" + number + ", name=" + name + "]";
	}

	// alt + shift + s + h
	// 책번호 number가 같으면 같은 책으로 판단한다
	// hashCode, equals 중 하나만 재정의 할 경우 중복되지 않는다고 판단할 수 있다
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return number == other.number;
	}

}