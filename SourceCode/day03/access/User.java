package access;

public class User {

// 필드
	// 사용자 이름
	private String id;
	// 사용자 비밀번호
	private String pw;
	// 사용자 이름
	private String name;
	// 사용자의 관리자 여부
	// 이건 외부에서 입력받지 않는다.
	private boolean isAdmin;

// 생성자 = 인스턴스 초기화 메소드
	public User() {
		super();
	}

	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		// 관리자와 일치하는 아이디일 경우에만 isAdmin 값을 true로 지정
		if (id.equals("admin")) {
			setAdmin(true);
		}
	}

// getter, setter
	// alt + shift + s + r
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	// 잘못된 값이 들어오는 것을 막기 위해서 private으로 접근 권한을 부여한다
	// 잘못된 값으로 초기화되지 않게 은닉화
	private void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
