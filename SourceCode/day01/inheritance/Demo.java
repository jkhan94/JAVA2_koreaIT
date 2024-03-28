package inheritance;

class Person {

	public int age;
	public String name;

	public Person() {
		System.out.println("parent class");
		// 자식 내에 say()가 있으므로 오버라이딩 됐다.
		// 메소드 오버라이딩 시, 재정의한 메소드를 실행.
		say();
	}

	public void say() {
		System.out.println("Someone speaks.");
	}
}

class Student extends Person {

	public String school;

	public Student() {
		System.out.println("Subclass");
	}

	public void say() {
		System.out.println("student:" + name + "," + age);
	}
	
	public void say2() {
		// 부모 클래스에 정의된 say()를 사용할 때.
		super.say();
	}
}

public class Demo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println();
		s.age = 20;
		s.name = "tom";
		s.say();
		s.say2();
	}
}
