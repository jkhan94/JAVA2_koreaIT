package inter2;

public class InterTest3 {

	public static void main(String[] args) {
		// 실습1.

		// Employee 클래스
		// 필드 (String shift, String name)

		// Office 인터페이스
		// 1. getToWork(Employee employee, String time)
		// 2. getoffWorkt(Employee employee, String time)
		// 3. getLunchMeal(Employee employee)
		// 4. getMorningMeal(Employee employee)

		// NightShift 클래스(Office 인터페이스 구현)
		// 22:00 ~ 07:00 근무시간
		// 1. getToWork() 메소드
		// 2201 ~ 0700 -> 000님 지각 출력
		// 2200 -> 000님 출근 완료 출력
		// 그외 -> 근무 시간이 아닙니다 출력
		// 2. getOffWork() 메소드
		// 2201 ~ 0659 -> 퇴근시간이 아닙니다 출력
		// 0700 -> 000님 퇴근 완료 출력
		// 그외 -> 근무 시간이 아닙니다 출력
		// 3. getMoringMeal() 메소드
		// 000님 식사

		// DayShift 클래스(Office 인터페이스 구현)
		// 09:00 ~ 16:00 근무시간
		// 1. getToWork() 메소드
		// 0901 ~ 1600 -> 000님 지각
		// 0900 -> 000님 출근 완료
		// 그외 -> 근무 시간이 아닙니다
		// 2. getOffWork() 메소드
		// 0901 ~ 1559 -> 퇴근시간이 아닙니다
		// 1600 -> 000님 퇴근 완료
		// 그외 -> 근무 시간이 아닙니다
		// 3. getLunchMeal() 메소드
		// 000님 식사

		NightShift night = new NightShift();
		DayShift day = new DayShift();
		
		Employee dayEmployee = new Employee("DayShift", "낮근무자");
		Employee nightEmployee = new Employee("NightShift", "밤근무자");
		
		// 22:00 ~ 07:00 근무시간
		// 2200 0700 출근완료 퇴근완료
		night.getToWork(nightEmployee, "2200");
		night.getoffWork(nightEmployee, "0700");

		// 2159 0659 근무시간아님 퇴근시간아님
		night.getToWork(nightEmployee, "2159");
		night.getoffWork(nightEmployee, "0659");

		// 2201 0701 지각 근무시간아님
		night.getToWork(nightEmployee, "2201");
		night.getoffWork(nightEmployee, "0701");

		night.getMorningMeal(nightEmployee);
		System.out.println();

		// 09:00 ~ 16:00 근무시간
		// 0900 1600 출근완료 퇴근완료
		day.getToWork(dayEmployee, "0900");
		day.getoffWork(dayEmployee, "1600");

		// 0859 1559 근무시간아님 퇴근시간아님
		day.getToWork(dayEmployee, "0859");
		day.getoffWork(dayEmployee, "1559");

		// 0901 1601 지각 근무시간아님
		day.getToWork(dayEmployee, "0901");
		day.getoffWork(dayEmployee, "1601");

		day.getLunchMeal(dayEmployee);
		System.out.println();

///////////////////////////////////////////////////////////////////		
		// 객체 배열
		// 자료형[] 배열명 new 자료형[칸수];
		int[] ar = new int[3];
		Employee[] employeeList = {dayEmployee, nightEmployee};
		
		System.out.println(ar[0]);
		System.out.println(employeeList[0]);
		System.out.println(employeeList[0].name);
		System.out.println();
		
		for (int i = 0; i < employeeList.length; i++) {
			System.out.println(employeeList[i].name);
		}

	}

}