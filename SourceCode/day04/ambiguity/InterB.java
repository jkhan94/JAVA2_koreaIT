package ambiguity;

public interface InterB {

	default void printData() {
		System.out.println("interB");
	};
	
	void printData2();

}
