// 그룹화
// 자바는 단일 상속만 가능하므로 타입을 구분하기 위해 마커 인터페이스를 사용
package marker;

public class MarkerTest {

	// 업캐스팅
	// 매개변수가 부모클래스면 해당 부모의 자식클래스를 매개변수로 받을 수 있음
	static void checkAnimal(Animal animal) {
		// 해당 동물이 포유류인지 조류인지를 확인한다
		if (animal instanceof MammalMarker) {
			System.out.println("포유류 입니다");
		} else if (animal instanceof BirdsMarker) {
			System.out.println("조류 입니다");
		}

	}

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		Pigeon pigeon = new Pigeon();
		Eagle eagle = new Eagle();

		MarkerTest.checkAnimal(cat);
		MarkerTest.checkAnimal(dog);
		MarkerTest.checkAnimal(eagle);
		MarkerTest.checkAnimal(pigeon);

	}

}
