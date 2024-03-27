package ambiguity;

//default 메소드가 있는 인터페이스
public interface InterD {

	// default = public
	default void printData() {
		System.out.println("인터페이스 interD의 메소드");
	}

}
