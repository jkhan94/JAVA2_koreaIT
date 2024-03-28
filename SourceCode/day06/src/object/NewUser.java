package object;

import java.util.Objects;

public class NewUser {

	// 필드
	int userNum;
	String userName;

	// 생성자
	public NewUser(int userNum, String userName) {
		super();
		this.userNum = userNum;
		this.userName = userName;
	}

	public NewUser() {
		super();
	}

// 메소드
// toString /////////////////////////////////////////
	// 직접 재정의
	// 객체 출력시 userName을 출력
//	@Override
//	public String toString() {
//		return userName;
//	}

	// 자동완성
	// alt + shift + s + Generate toString()
	@Override
	public String toString() {
		return "NewUser [userNum=" + userNum + ", userName=" + userName + "]";
	}

// equals /////////////////////////////////////////////////////
	// 직접 재정의
//	@Override
//	public boolean equals(Object obj) {
//		NewUser newUser = (NewUser) obj;
//		return newUser.userNum == userNum;
//	}

	// 자동완성
	// alt + shift + s + generate hashcode()/equals()
	@Override
	public int hashCode() {
		return Objects.hash(userName, userNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewUser other = (NewUser) obj;
		return Objects.equals(userName, other.userName) && userNum == other.userNum;
	}

}
