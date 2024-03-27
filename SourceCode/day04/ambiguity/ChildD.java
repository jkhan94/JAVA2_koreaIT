package ambiguity;

public class ChildD extends ClassD implements InterD {

	// 공백으로 두고 printData() 호출 시 부모클래스인 classD의 printData() 실행
	// 아래처럼 오버라이딩하면 자식 메소드 출력.
	
	// super = 부모클래스 = classD
	// classD.printData() 실행하고, dd 출력	
	@Override
	public void printData() {
		super.printData();
		InterD.super.printData();
		System.out.println("Calls ChildD printData.");		
	}

}
