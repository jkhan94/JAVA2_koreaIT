package list;

class Generic<T, N> {
	T data;
	N data2;
}

// < T extends Number>처럼 쓸 수도 있다
// Number 클래스를 상속받는 것만 T가 될 수 있다
public class GenericTest<T> {

	// data의 타입을 GenericTest를 객체화할 때 정하겠다
	// T 대신 Object를 쓸 경우 뭐든 들어올 수 있지만 타입 제한 불가
	// 그리고 메소드를 호출할 때는 다운캐스팅을 해야 함
	// 따라서 제네릭을 사용
	T data;

	public GenericTest() {
		System.out.println(data);
	}

	public GenericTest(T data) {
		System.out.println("생성자 " + data);
		this.data = data;
	}

	public static void main(String[] args) {

		GenericTest<Integer> intGen = new GenericTest<Integer>();
		GenericTest<Integer> intGen2 = new GenericTest<Integer>(10);
		// Integer 클래스인데 String을 넣으니 에러가 남
		// GenericTest<Integer> intGen3 = new GenericTest<Integer>("문자열");

		System.out.println(intGen.data);
		System.out.println(intGen2.data);
		System.out.println();

		GenericTest<String> strGen = new GenericTest<String>();
		GenericTest<String> strGen1 = new GenericTest<String>("hello");

		System.out.println(strGen.data);
		System.out.println(strGen1.data);
		// 아래는 type mismatch
		// 문자열에 boolean을 넣을 수 없다
		// strGen.data = true;

	}

}