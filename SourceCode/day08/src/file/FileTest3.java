package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) {

// 출력
		// import 단축키 : ctrl + shift + o
		BufferedWriter bw = null;

		try {
			// test3.txt와 동일한데 close() 대신 flush() 사용
			bw = new BufferedWriter(new FileWriter(new File("test4.txt")));
			bw.write("안녕하세요");
			bw.write("안녕하세요1");

			// 줄바꿈
			// 1.개행문자를 사용
			bw.write("Hello\n");
			// 2.메소드를 사용
			// newLine()은 운영체제에 맞춰서 개행함
			// 윈도우 -> /r/n
			bw.write("안녕하세요2");
			bw.newLine();
			bw.write("안녕하세요2");

			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {

			}
		}

// try-with-resources 구문
// 자동으로 닫힌다 -> finally 사용 불필요
		try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(new File("test5.txt")))) {
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
