package inter2;

public interface Office {
	// Office 인터페이스
	// 1. getToWork(Employee employee, String time)
	// 2. getoffWorkt(Employee employee, String time)
	// 3. getLunchMeal(Employee employee)
	// 4. getMorningMeal(Employee employee)

	int NIGHT_START_TIME = 2200;
	int NIGHT_END_TIME = 700;

	int DAY_START_TIME = 900;
	int DAY_END_TIME = 1600;

	void getToWork(Employee employee, String time);

	void getoffWork(Employee employee, String time);

	void getLunchMeal(Employee employee);

	void getMorningMeal(Employee employee);

}
