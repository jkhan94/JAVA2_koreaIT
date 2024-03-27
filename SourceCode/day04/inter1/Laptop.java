package inter1;

public interface Laptop {
	
	// Laptop 인터페이스에 Power 필드 추가(220)
	// my name / 변수 myName / 상수 MY_NAME
	int POWER=220;

	void turnOn();
	
	void turnOn(int power);

	void turnOff();

}
