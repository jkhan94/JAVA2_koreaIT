package inheritance;

public class mkaer {
	public static void main(String args[]) {

		// 객체 c에는 부모에서 선언된 a와 자신 내부에서 선언된 a가 있음.
		child c = new child();

		System.out.println(c.a);

		// 부모의 a가 바뀜.
		c.parent_method();
		// 출력되는 건 자식의 a.
		// 만약 자식 내에 a가 없다면 출력되는 건 부모 값. 여기선 parent_method를 통해 값을 바꾸므로 20.
		// parent_method를 호출하지 않고 c 내에 a가 없다면 10.
		// c 내에 a가 있으므로 parent_method와 무관하게 33 출력.
		System.out.println(c.a);

	}
}

class parent {
	int a = 10;

	public void parent_method() {
		this.a = 20;
	}
}

class child extends parent {

	int a = 33;
}