package inter2;
//int NIGHT_START_TIME = 2200;
//int NIGHT_END_TIME = 700;

public class NightShift extends OfficeAdapter {
	// NightShift 클래스(Office 인터페이스 구현)
	// 22:00 ~ 07:00 근무시간

	// 1. getToWork() 메소드
	// 2201 ~ 0700 -> 000님 지각 출력
	// 2200 -> 000님 출근 완료 출력
	// 그외 -> 근무 시간이 아닙니다 출력
	@Override
	public void getToWork(Employee employee, String time) {
//		if (time.equals("2200")) {
//			System.out.println(employee.name + "님 출근 완료");
//		} else if (Integer.parseInt(time) > 2200 || Integer.parseInt(time) <= 0700) {
//			System.out.println(employee.name + "님 지각");
//		} else {
//			System.out.println("근무 시간이 아닙니다");
//		}
		
//		int now = Integer.parseInt(time);
//		// 22:00시 출근이면 출근완료
//		if (now == 2200) {
//			System.out.println(employee.name + "님 출근 완료");
//		}
//		// 22:01~07:00시 출근이면 지각
//		else if (now > 2200 || now <= 700) {
//			System.out.println(employee.name + "님 지각");
//		}
//		// 그 외 시간 출근이라면
//		else {
//			System.out.println("근무 시간이 아닙니다");
//		}	

		// 모범답안
		// 22:00 2200
		// 출근한 시각 > 2200 지각
		int now = Integer.parseInt(time);
		// 22:00 시 출근이라면 출근완료
		if (now == NIGHT_START_TIME) {
			System.out.println(employee.name + "님 출근완료");
		}
		// 22:01 ~ 07:00 시 출근이라면 지각
		else if (now > NIGHT_START_TIME || now <= NIGHT_END_TIME) {
			System.out.println(employee.name + "님 지각");
		}
		// 그외 시간 출근이라면
		else {
			System.out.println("근무 시간이 아닙니다");
		}
	
	}

//////////////////////////////////////////////////////////////////////
	// 2. getOffWork() 메소드
	// 2201 ~ 0659 -> 퇴근시간이 아닙니다 출력
	// 0700 -> 000님 퇴근 완료 출력
	// 그외 -> 근무 시간이 아닙니다 출력
	@Override
	public void getoffWork(Employee employee, String time) {
//		if (time.equals("0700")) {
//			System.out.println(employee.name + "님 퇴근 완료");
//		} else if (Integer.parseInt(time) > 2200 || Integer.parseInt(time) < 700) {
//			System.out.println("퇴근시간이 아닙니다");
//		} else {
//			System.out.println("근무 시간이 아닙니다");
//		}

		// 모범답안
		int now = Integer.parseInt(time);
		// 07:00 시 퇴근이라면 퇴근완료
		if (now == NIGHT_END_TIME) {
			System.out.println(employee.name + "님 퇴근완료");
		}
		// 22:01 ~ 06:59 시 퇴근이라면 퇴근시간이 아닙니다
		else if (now >= NIGHT_START_TIME + 1 || now < NIGHT_END_TIME) {
			System.out.println("퇴근시간이 아닙니다");
		}
		// 그외 시간 퇴근이라면
		else {
			System.out.println("근무 시간이 아닙니다");
		}
	}

//////////////////////////////////////////////////////////////////
	// 3. getMoringMeal() 메소드
	// 000님 식사
	@Override
	public void getMorningMeal(Employee employee) {
		System.out.println(employee.name + "님 식사");
	}

}
