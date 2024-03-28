package ambiguity;

public interface InterA {

	default void printData() {
		System.out.println("interA");
	};
	
	void printData2();

}
