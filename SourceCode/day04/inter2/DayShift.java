package inter2;
//int DAY_START_TIME = 900;
//int DAY_END_TIME = 1600;

public class DayShift extends OfficeAdapter {
	// DayShift 클래스(Office 인터페이스 구현)
	// 09:00 ~ 16:00 근무시간
	// 1. getToWork() 메소드
	// 0901 ~ 1600 -> 000님 지각
	// 0900 -> 000님 출근 완료
	// 그외 -> 근무 시간이 아닙니다

	@Override
	public void getToWork(Employee employee, String time) {
//		if (time.equals("0900")) {
//			System.out.println(employee.name + "님 출근 완료");
//		} else if (Integer.parseInt(time) >= 901 && Integer.parseInt(time) <= 1600) {
//			System.out.println(employee.name + "님 지각");
//		} else {
//			System.out.println("근무 시간이 아닙니다");
//		}

		// 모범답안
		// 09:00 ~ 16:00 근무시간
		int now = Integer.parseInt(time);
		// 09:00 시 출근이라면 출근완료
		if (now == DAY_START_TIME) {
			System.out.println(employee.name + "님 출근완료");
		}
		// 09:01 ~ 16:00 시 출근이라면 지각
		else if (now >= DAY_START_TIME + 1 && now <= DAY_END_TIME) {
			System.out.println(employee.name + "님 지각");
		}
		// 그외 시간 출근이라면
		else {
			System.out.println("근무 시간이 아닙니다");
		}
	}

//////////////////////////////////////////////////////////////////////
	// 2. getOffWork() 메소드
	// 0901 ~ 1559 -> 퇴근시간이 아닙니다
	// 1600 -> 000님 퇴근 완료
	// 그외 -> 근무 시간이 아닙니다
	@Override
	public void getoffWork(Employee employee, String time) {
//		if (time.equals("1600")) {
//			System.out.println(employee.name + "님 퇴근 완료");
//		} else if (Integer.parseInt(time) <= 1559 && Integer.parseInt(time) >= 901) {
//			System.out.println("퇴근시간이 아닙니다");
//		} else {
//			System.out.println("근무 시간이 아닙니다");
//		}

		// 모범답안
		int now = Integer.parseInt(time);
		// 16:00 시 퇴근이라면 퇴근완료
		if (now == DAY_END_TIME) {
			System.out.println(employee.name + "님 퇴근완료");
		}
		// 09:01 ~ 15:59 시 퇴근이라면 퇴근시간이 아닙니다
		else if (now >= DAY_START_TIME + 1 && now < DAY_END_TIME) {
			System.out.println("퇴근시간이 아닙니다");
		}
		// 그외 시간 퇴근이라면
		else {
			System.out.println("근무 시간이 아닙니다");
		}
	}

////////////////////////////////////////////////////////////////////
	// 3. getLunchMeal() 메소드
	// 000님 식사
	@Override
	public void getLunchMeal(Employee employee) {
		System.out.println(employee.name + "님 식사");
	}

}
