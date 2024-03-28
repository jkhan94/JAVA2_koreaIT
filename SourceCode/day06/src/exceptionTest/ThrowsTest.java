package exceptionTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsTest {
	static void myMethod() throws IOException {
		// 프로젝트 폴더에 test.txt 파일 생성
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
	}

	public static void main(String[] args) {
		try {
			ThrowsTest.myMethod();
		} catch (IOException e) {
			// 파일이 생성되지 못할 경우 에러 메시지 출력
			System.out.println(e.getMessage());
		}

	}

}
