package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) {

// 출력
		// import 단축키 : ctrl + shift + o
		BufferedWriter bw = null;

		// FileWriter 생성자에 해당 파일의 이어쓰기 여부를 true로 주면 이어 쓸 수 있다
		// 기본값은 false. 표기하지 않으면 덮어쓴다
		try {
			bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
//			bw = new BufferedWriter(new FileWriter(new File("test3.txt"),true));
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

			// flush만 하면 통로는 열어둔 채 지금까지의 데이터만 파일에 작성
			// close를 쓰면 flush 후 버퍼를 닫는다
//			bw.flush();			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
// 입력
		BufferedReader br = null;
		String line = null;

		try {
			br = new BufferedReader(new FileReader("test3.txt"));
			// readLine()은 값을 읽어올 때 줄바꿈 문자는 가져오지 않는다
			// 줄바꿈 문자를 만나면 읽기를 중단한다
			// line by line으로 읽음
			while ((line = br.readLine()) != null) {
//				System.out.print(line);
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다!");
		} catch (IOException e) {
			System.out.println("연결 오류");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
		}

	}

}
