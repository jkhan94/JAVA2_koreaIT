package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest4 {

	public static void main(String[] args) {

		// 회원가입
		join("test", "test");

		// 로그인
		login("test", "test");
		login("test1", "test");
		login("test", "test1");

	}

	// 입력한 id가 user에 있는지 확인.
	static boolean checkId(String id) {
		String line = null;
		String[] userInfo = null;

		try (BufferedReader br = new BufferedReader(new FileReader("user.txt"))) {
			while ((line = br.readLine()) != null) {
				userInfo = line.split(" ");
				if (userInfo[0].equals(id)) {
					return true;
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return false;

	}

	// 회원가입: id, pw를 user에 등록
	static void join(String id, String pw) {
		if (checkId(id)) {
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt", true))) {
			bw.write(id + " " + pw);
			bw.newLine();
		} catch (IOException e) {
			;
		} finally {
			System.out.println("회원가입 성공!");
		}

	}

	// 로그인: 입력받은 id가 있으면 pw가 맞는지 확인.
	static void login(String id, String pw) {

		String line = null;
		boolean result = false;
		String[] userInfo = null;

		try (BufferedReader br = new BufferedReader(new FileReader("user.txt"))) {
			while ((line = br.readLine()) != null) {
				userInfo = line.split(" ");
				if (userInfo[0].equals(id)) {
					result = userInfo[1].equals(pw) ? true : false;
				}
				if (result) {
					break;
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(result ? "로그인 성공" : "로그인 실패");

	}

}
