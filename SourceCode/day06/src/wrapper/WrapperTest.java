package wrapper;

public class WrapperTest {

	public static void main(String[] args) {

		// boxing
		Integer num1 = new Integer(3);
		Integer num2 = Integer.valueOf(3);
		Double doubleNum = Double.valueOf(3.0);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(doubleNum);
		System.out.println(num2.toString());

		// unboxing
		int intNum = num1.intValue();
		System.out.println(intNum);
		System.out.println();

		// auto boxing
		Integer num3 = 3;
		System.out.println(num3);

		// auto unboxing
		int intNum2 = num3;
		System.out.println(intNum2);

	}

}
